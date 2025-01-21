package OOPS_AC;

public class OOPS {
    public static void main(String[] args) {
    Pen p1 = new Pen();
    p1.setColor("Red");
    p1.setTip(3);
    System.out.println(p1.color + " " + p1.tip);

    bankAccount myAcc = new bankAccount();
    myAcc.username = "Ekansh";
    //myAcc.password = "ekansh@123"  due to private var we can't update the value
    myAcc.setPassword("newPassword");
    System.out.println(myAcc);
    }
}

class bankAccount{
    private String password;
    public String username;
    void setPassword(String newPwd){
        password = newPwd;
    }
}

class Pen{
    String color;
    int tip;
    void setColor(String newColor){
         color  = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
