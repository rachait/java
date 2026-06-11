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

        TreeSet<Integer> set = new TreeSet<>();

        for(int i = 0; i < n; i++) {
            set.add(nums1[i]);
        }

        for(int i = 0; i < m; i++) {
            set.add(nums2[i]);
        }

        System.out.println(set);
    }
}