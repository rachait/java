interface Demo {
    void show();
}

public class anomodemo {

    public static void main(String[] args) {

        Demo obj = new Demo() {

            @Override
            public void show() {
                System.out.println("Hello from anonymous class");
            }
        };

        obj.show();
    }
}