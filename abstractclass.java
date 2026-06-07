abstract class Base{
    public Base(){
        System.out.println("I am a constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Base{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good evening");
    }
}
abstract class Child3 extends Base{
    
    public void th(){
        System.out.println("Good afternoon");
    }
}

public class abstractclass {
    public static void main(String[] args) {
         
    }
}
