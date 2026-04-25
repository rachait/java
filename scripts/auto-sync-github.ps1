param(
    [string]$RepoPath = (Get-Location).Path,
    [string]$Remote = "origin",
    [string]$Branch = "",
    [int]$DebounceSeconds = 3,
    [int]$PollSeconds = 1
)

$ErrorActionPreference = "Stop"

$resolvedRepoPath = (Resolve-Path -Path $RepoPath).Path

if (-not (Test-Path -Path (Join-Path -Path $resolvedRepoPath -ChildPath ".git"))) {
    throw "The path '$resolvedRepoPath' is not a Git repository."
}

if ([string]::IsNullOrWhiteSpace($Branch)) {
    $Branch = (git -C $resolvedRepoPath branch --show-current).Trim()
    if ([string]::IsNullOrWhiteSpace($Branch)) {
        $Branch = "main"
    }
}

Write-Host "Auto-sync started for $resolvedRepoPath"
Write-Host "Remote: $Remote | Branch: $Branch"
Write-Host "Waiting for file changes... Press Ctrl+C to stop."

$script:pendingChange = $false
$script:lastChangeTime = Get-Date

function Push-IfNeeded {
    param(
        [string]$Path,
        [string]$RemoteName,
        [string]$BranchName
    )

    git -C $Path add -A

    $stagedFiles = git -C $Path diff --cached --name-only
    if (-not $stagedFiles) {
        return
    }

    $timestamp = Get-Date -Format "yyyy-MM-dd HH:mm:ss"
    $commitMessage = "auto-sync: $timestamp"

    Write-Host "Committing changes..."
    git -C $Path commit -m $commitMessage | Out-Host

    Write-Host "Pushing to GitHub..."
    git -C $Path push $RemoteName $BranchName | Out-Host

    Write-Host "Sync complete at $timestamp"
}

$watcher = New-Object System.IO.FileSystemWatcher
$watcher.Path = $resolvedRepoPath
$watcher.Filter = "*"
$watcher.IncludeSubdirectories = $true
$watcher.NotifyFilter = [System.IO.NotifyFilters]::FileName -bor [System.IO.NotifyFilters]::DirectoryName -bor [System.IO.NotifyFilters]::LastWrite
$watcher.EnableRaisingEvents = $true

$onChange = {
    if ($Event.SourceEventArgs.FullPath -match "\\\\.git(\\\\|$)") {
        return
    }

    $script:pendingChange = $true
    $script:lastChangeTime = Get-Date
}

$changedEvent = Register-ObjectEvent -InputObject $watcher -EventName Changed -Action $onChange
$createdEvent = Register-ObjectEvent -InputObject $watcher -EventName Created -Action $onChange
$deletedEvent = Register-ObjectEvent -InputObject $watcher -EventName Deleted -Action $onChange
$renamedEvent = Register-ObjectEvent -InputObject $watcher -EventName Renamed -Action $onChange

try {
    while ($true) {
        Start-Sleep -Seconds $PollSeconds

        if (-not $script:pendingChange) {
            continue
        }

        $secondsSinceLastChange = (New-TimeSpan -Start $script:lastChangeTime -End (Get-Date)).TotalSeconds
        if ($secondsSinceLastChange -lt $DebounceSeconds) {
            continue
        }

        $script:pendingChange = $false

        try {
            Push-IfNeeded -Path $resolvedRepoPath -RemoteName $Remote -BranchName $Branch
        }
        catch {
            Write-Host "Auto-sync failed: $($_.Exception.Message)"
        }
    }
}
finally {
    Unregister-Event -SourceIdentifier $changedEvent.Name -ErrorAction SilentlyContinue
    Unregister-Event -SourceIdentifier $createdEvent.Name -ErrorAction SilentlyContinue
    Unregister-Event -SourceIdentifier $deletedEvent.Name -ErrorAction SilentlyContinue
    Unregister-Event -SourceIdentifier $renamedEvent.Name -ErrorAction SilentlyContinue

    $watcher.Dispose()
}
