public class method_overloading {
    static void change(int a){
        a = 98;
    }
    static void foo(){
        System.out.println("Good Morning");
    }
    static void foo(int a){
        System.out.println("Good Morning " + a+ "Bro!");
    }
     static void foo(int a, int b){
        System.out.println("Good Morning " + a+ "Bro!");
        System.out.println("Good Morning " + b+ "Bro!");
    }
    static void foo(int a, int b, int c){
        System.out.println("Good Morning " + a+ "Bro!");
        System.out.println("Good Morning " + b+ "Bro!");
        System.out.println("Good Morning " + c+ "Bro!");
    }
    static void tellJoke(){
        System.out.println("I invented a new word! Plagiarism!");
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }
    public static void main(String[] args) {
        tellJoke();
        int [] marks = {52, 45, 78, 32, 56, 73};
        int x = 45;
        // change(x);
        // //System.out.println(x);
        // change2(marks);
        // System.out.println(marks[0]);
        foo();
        foo(300);
        foo(300, 400);
    
    }
}
