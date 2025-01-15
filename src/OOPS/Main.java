package OOPS;
//Java constructor:A constructor in javaa is similar to a method
// that is invoked when an object of a class is created

public class Main {

    private String name;
    Main(String lang){
        //System.out.println("Constructor called");
       // name = "AlgoCamp";
        name = lang;
        System.out.println("the lang is" + " C++");
    }
    public static void main(String args[]){
      //  Main obj = new Main();
        //System.out.println("the name is "+ obj.name);
        Main obj1 = new Main("C++");

    }
}
