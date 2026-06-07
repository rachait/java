public class Runtimeerror {
     public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try {
            int c = a/b;
            System.out.println("Result: " + c);
        } 
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println("End of Program");
    }
}
