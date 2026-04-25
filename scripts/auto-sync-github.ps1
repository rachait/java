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
$script:lastSnapshot = ""

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

try {
    while ($true) {
        Start-Sleep -Seconds $PollSeconds

        $changes = git -C $resolvedRepoPath status --porcelain
        if (-not $changes) {
            $script:pendingChange = $false
            $script:lastSnapshot = ""
            continue
        }

        $snapshot = ($changes | Out-String).Trim()

        if ($snapshot -ne $script:lastSnapshot) {
            $script:pendingChange = $true
            $script:lastSnapshot = $snapshot
            $script:lastChangeTime = Get-Date
            continue
        }

        if (-not $script:pendingChange) {
            $script:pendingChange = $true
            $script:lastChangeTime = Get-Date
            continue
        }

        $secondsSinceLastChange = (New-TimeSpan -Start $script:lastChangeTime -End (Get-Date)).TotalSeconds
        if ($secondsSinceLastChange -lt $DebounceSeconds) {
            continue
        }

        $script:pendingChange = $false
        $script:lastSnapshot = ""

        try {
            Push-IfNeeded -Path $resolvedRepoPath -RemoteName $Remote -BranchName $Branch
        }
        catch {
            Write-Host "Auto-sync failed: $($_.Exception.Message)"
        }
    }
}
finally {
    Write-Host "Auto-sync stopped."
}
