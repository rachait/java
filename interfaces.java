interface bicycle {
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class AvonCycle implements bicycle{
    public void applyBrake(int decrement){
        System.out.println("Applying brake " + decrement);
    }
    public void speedUp(int increment){
        System.out.println("Speeding up " + increment);
    }
}
public class interfaces {
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBrake(1);
        cycle.speedUp(2);
    }
}