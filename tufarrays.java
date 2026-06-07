import java.util.Scanner;
public class tufarrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int x: arr){
            System.out.print(x);
        }
        }
    }
import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int largest = 0;
        int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        // int arr[] = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        // for(int x: arr){
        //     System.out.print(x+" ");
        // }
        for(int i=0;i<n;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        
        System.out.println(largest);
        }
    }