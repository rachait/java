class Base1{
    Base1(){
        System.out.println("Base class constructor");
    }
    Base1(int x){
        System.out.println("Base class constructor with parameter: " + x);
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("Derived class constructor");
    }
    Derived(int x){
        super(x); // Call the parameterized constructor of the base class
        System.out.println("Derived class constructor with parameter: " + x);
    }
}

public class constructorsininheritance {
    public static void main(String[] args) {
        Derived1 d1 = new Derived1();
        Derived1 d2 = new Derived1(10);

    }
}