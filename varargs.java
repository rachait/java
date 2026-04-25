
import javax.security.auth.x500.X500Principal;



public class varargs {
    // static int sum(int a, int b){
    //     return a+b;
    // }
    static int sum(int x, int ...arr){
        int result = x;
        for (int a: arr) {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 4 and 5 is " + sum(4, 5));
        System.out.println("The sum of 1, 2, 3, 4, and 5 is " + sum(1, 2, 3, 4, 5));
        System.out.println("The sum of no arguments is " + sum());
    }
}