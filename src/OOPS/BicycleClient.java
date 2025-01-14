package OOPS;

public class BicycleClient {
    public static void main(String[] args) {
        // create object
        Bicycle sportsBicycle = new Bicycle();

        // Accessing the gear using the getter
        System.out.println("Gear: " + sportsBicycle.getGear());

        // Accessing static method
        Bicycle.braking();
    }
}
