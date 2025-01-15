package OOPS;
//constructor overloading
public class Main3 {
    int a , b;
    private Main3(int i ,int j){
        this.a = i;
        this.b = j;
    }
    private Main3(int i ){
        this(i,i);
    }
    private Main3(){
        this(0);
    }
    @Override
    public String toString(){
        return this.a + "- "+this.b;
    }

    public static void main(String[] args){
        Main3 m1 = new Main3(2,3);
        System.out.println(m1);

        Main3 m2 = new Main3(4,5);
        System.out.print(m2);
    }
}
