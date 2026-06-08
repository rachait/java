Pattern 2
import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

Pattern 3

import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

Pattern 4

import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

Pattern 5
import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

Pattern 6 
import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

Pattern 7
import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<=n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            for(int j=0; j<=n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

Pattern 8
import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<=i;j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*n-(2*i+1); j++){
                System.out.print("*");
            }
            for(int j=0; j<=n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

Pattern 9
import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            
            for(int j=0; j<=i;j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*n-(2*i+1); j++){
                System.out.print("*");
            }
            for(int j=0; j<=n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

Pattern 10
import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int stars
        for(int i=1; i<=2*n-1; i++){
            int s = i;
            if(i >n ) s =2*n-i;
            for(int j=1; j<=s; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}

Pattern 11
import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int stars
        int start =1;
        for(int i=1; i<n; i++){
            if(i%2==0) start =1;
            else start =0;
            for(int j=0; j<=i; j++){
                System.out.print(start);
                start = 1- start;
            }
            
            System.out.println();
        }
    }
}

Pattern 12
import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int stars
        int space  = 2*(n-1);
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++ ){
                System.out.print(j);
            }
            for(int j=1; j<=space; j++ ){
                System.out.print(" ");
            }
            
            for(int j=i; j>=1; j-- ){
                System.out.print(j);
            }
            System.out.println();
            space -=2;
            }
        }
    }


Pattern 13
import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int stars
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                num = num +1;
                
            }
            System.out.println();
        
            }
        }
    }


Pattern 14
import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int stars
        for(int i=1; i<n; i++){
            for(char ch = 'A'; ch<='A' + i; ch++){
                System.out.print(ch +" ");
            }
            System.out.println();
        
            }
        }
    }


Pattern 15
import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int stars
        for(int i=1; i<n; i++){
            for(char ch = 'A'; ch<='A' + (n - i -1); ch++){
                System.out.print(ch +" ");
            }
            System.out.println();
        
            }
        }
    }

Pattern 16
import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int stars
        for(int i=0; i<n; i++){
            char ch = (char) ('A' + i);
            for(int j=0; j<=i; j++){
                System.out.print(ch + " ");
            }
            System.out.println();
        
            }
        }
    }


pattern 17


Print N to 1 using Recursion
import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            System.out.println(i);
        }
    }
}


Sum of First N Numbers
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        for(int i=0; i<=n; i++){
            sum = sum + i;
            System.out.println(sum);
        }
    }
}

factorial of a number
import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fact  = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        System.out.print(fact);
    }
}

count digits
import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println(1);
        }
        int count  = 0;
        while(n>0){
            count++;
            n=n/10;
            
        }
        System.out.println(count);
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int r = 0;
        int d = n;
        int sum = 0;
        while(n>0){
            int id = n % 10;
            // r = (r * 10) + id;
            sum = sum + (id*id*id);
            n = n /10;
            
        }
        // System.out.println();
        // System.out.println(r);
        if(sum == d){
            System.out.println(sum);
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
    }
    
}



// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        int largest = arr[0];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

public class largestelemet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("First "+largest);
        int second = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] != largest) {
                if (second == -1 || arr[i] > second) {
                    second = arr[i];
                }
            }
        }

        System.out.println("Second " + second);
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        int largest = arr[0];
        int second = -1;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // for(int i=0; i<n; i++){
        //     if(arr[i] > largest){
        //         largest = arr[i];
        //     }
        // }
        // System.out.println(largest);
        // for(int i = n-2; i>=0; i--){
        //     if(arr[i] != largest){
        //         second = arr[i];
        //         break;
        //     }
        // }
        for(int i=1;i<n;i++){
            if(arr[i]>=arr[i-1]){
                
            }
            else{
                System.out.println("false");
            }
            System.out.println("true");
        }
        
        // System.out.println(second);
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        int largest = arr[0];
        int second = -1;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // for(int i=0; i<n; i++){
        //     if(arr[i] > largest){
        //         largest = arr[i];
        //     }
        // }
        // System.out.println(largest);
        // for(int i = n-2; i>=0; i--){
        //     if(arr[i] != largest){
        //         second = arr[i];
        //         break;
        //     }
        // }
        for(int i=1;i<n;i++){
            if(arr[i]>=arr[i-1]){
                
            }
            else{
                System.out.println("false");
            }
            System.out.println("true");
        }
        
        // System.out.println(second);
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt(); 
        }
        int i = 0;
         for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
        System.out.println(i+1);
    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int temp = arr[0];

        for(int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }

        arr[n - 1] = temp;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        d = d%n;
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
            temp[i] = arr[(i+d) % n];
        }
        
        // for(int i = 1; i < n; i++) {
        //     arr[i - 1] = arr[i];
        // }
        // arr[n - 1] = temp;
        for(int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}