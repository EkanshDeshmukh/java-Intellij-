package OOPS_AC;

public class Abstaction {
    public static void main(String[] args) {
    Horse h = new Horse();
    h.eat();
    h.walks();
System.out.println(h.color);
h.changeColor();
        System.out.println(h.color);

    }
}
abstract class Animal2{
    String color;
    Animal2(){
        color = "brown";
    }
    void eat(){
        System.out.println("aniaml eats");
    }
    abstract void walks();
}

class Horse extends Animal2{
    void walks(){
        System.out.println("walks on 4 legs");
    }
    void changeColor(){
        color = "white";
    }
}
