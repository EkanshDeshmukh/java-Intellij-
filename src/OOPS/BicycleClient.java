package OOPS;

public class BicycleClient {

  public static void main(String args[]){
      //create object
      Bicycle sportCycle = new Bicycle();
      System.out.println(sportCycle.getGear());
      sportCycle.braking();
      sportCycle.setGear(20);
      System.out.println(sportCycle.getGear());
  }

}
