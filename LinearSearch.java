import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the number which you want to search in array: ");
        int num = sc.nextInt();
        boolean found = false;
        for(int i=0;i<n;i++){
            if(arr[i] == num){
                System.out.println("element found " + i);
                found = true;
                break;
            }
            // System.out.println()
        }
        if(!found){
            System.out.println("not found");
        }
        
    }
}
