interface New{
    void show();
}
public class lambda {
    public static void main(String[] args) {
        New obj = () -> System.out.println("Hello from lambda expression");
        obj.show();
    }
}