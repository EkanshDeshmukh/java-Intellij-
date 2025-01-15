package OOPS;
//Java constructor:A constructor in javaa is similar to a method
// that is invoked when an object of a class is created

public class Main {

    private String name;
    Main(){
        System.out.println("Constructor called");
        name = "AlgoCamp";
    }
    public static void main(String args[]){
        Main obj = new Main();
        System.out.println("the name is "+ obj.name);
    }
}
