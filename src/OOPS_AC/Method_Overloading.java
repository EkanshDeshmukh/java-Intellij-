package OOPS_AC;

public class Method_Overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(4,4));
        System.out.println(calc.sum((float)4.5 ,(float) 4.5));
        System.out.println(calc.sum(4,4,4));
    }
}

class Calculator{
    int sum(int a ,int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
