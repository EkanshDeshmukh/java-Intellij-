package OOPS;

public class Bicycle {

    //state of a field
    private int gear = 5;
    // Getter method for gear
    public int getGear() {
        return gear;
    }
    public void setGear(int gear){
        this.gear = gear;
    }
    //behaviour or method
    public static void braking (){
        System.out.println("brakinggggg");
    }
    public static void main(String str[]){
        braking();
    }
}
