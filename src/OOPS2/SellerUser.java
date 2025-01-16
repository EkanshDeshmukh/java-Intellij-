package OOPS2;

public class SellerUser extends User{
    public SellerUser(String username, String email){
        super(username,email);
    }
    public void sellProducts(){
        System.out.println("customer is selling products");
    }
}
