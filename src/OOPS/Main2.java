package OOPS;
//constructor-overloading

public class Main2 {
    String lang;

    Main2(){
    lang = "Java";
    }
    Main2(String language){
        lang = language;
    }

    public void getName(){
        System.out.println("langugae is "+lang);
    }
    public static void main (String args[]){
        Main2 objj1 = new Main2();
        objj1.getName();
        Main2 objj2 = new Main2("JS");
        objj2.getName();
    }

}
