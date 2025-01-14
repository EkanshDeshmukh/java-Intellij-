package OOPS;

public class Bicycle {

    // state of a field
    private int gear = 5;

    // getter for the gear field
    public int getGear() {
        return gear;
    }

    // behavior or method
    public static void braking() {
        System.out.println("breakiiiing");
    }

    public static void main(String[] args) {
        braking();
    }
}
