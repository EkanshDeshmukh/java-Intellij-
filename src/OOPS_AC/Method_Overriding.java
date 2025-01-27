package OOPS_AC;

public class Method_Overriding {
    public static void main(String[] args) {
    Deer d  = new Deer();
    d.eat();
    }
}

class Animal1{
    void eat(){
        System.out.println("eats everthing");
    }
}
class Deer extends Animal1{
    void eat(){
        System.out.println("eats grass");
    }
}
