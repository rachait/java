class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}
class Car extends Vehicle{
    void run(){
        System.out.println("Car is running");
    }
}


public class inheritance {
    public static void main(String[] args) {
        Car c = new Car();
        c.run();
    }
}
