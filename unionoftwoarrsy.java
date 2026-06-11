import java.util.*;

public class unionoftwoarrsy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        for(int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] nums2 = new int[m];
        for(int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }
        int[] union = new int[n + m];
        int k = 0;
        int i = 0, j = 0;
        while(i < n && j < m) {
            if(nums1[i] < nums2[j]) {
                if(k == 0 || union[k - 1] != nums1[i]) {
                    union[k++] = nums1[i];
                }
                i++;
            }
            else if(nums1[i] > nums2[j]) {
                if(k == 0 || union[k - 1] != nums2[j]) {
                    union[k++] = nums2[j];
                }
                j++;
            }
            else {
                if(k == 0 || union[k - 1] != nums1[i]) {
                    union[k++] = nums1[i];
                }
                i++;
                j++;
            }
        }
        while(i < n) {
            if(k == 0 || union[k - 1] != nums1[i]) {
                union[k++] = nums1[i];
            }
            i++;
        }
        while(j < m) {
            if(k == 0 || union[k - 1] != nums2[j]) {
                union[k++] = nums2[j];
            }
            j++;
        }
        for(i = 0; i < k; i++) {
            System.out.print(union[i] + " ");
        }
    }
}