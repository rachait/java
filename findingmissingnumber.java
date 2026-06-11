import java.util.*;

public class findingmissingnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int arraySum = 0;
         for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            arraySum += arr[i];
        }
        int totalSum = n * (n + 1) / 2;
        System.out.println("Missing Number = " + (totalSum - arraySum));
   }
}