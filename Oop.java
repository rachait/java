class Pen {
    String color;
    int price;

    public void write() {
        System.out.println("writing something");
    }

    public void printcolor() {
        System.out.println(this.color);
    }
}

public class Oop {
    public static void main(String[] args) {

        Pen pen1 = new Pen();

        pen1.color = "blue";
        pen1.price = 10;

        System.out.println("Pen color: " + pen1.color);
        System.out.println("Pen price: " + pen1.price);

        pen1.write();
        pen1.printcolor();
    }
}