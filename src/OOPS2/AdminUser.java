package OOPS2;

public class AdminUser extends User {

    public AdminUser(String username,String email){
        super(username,email);
    }
    public void manageProducts(){
        System.out.println("Admin is managing products");
    }

    @Override
    public void showDashboard(   ) {
         System.out.println( " Admin user specialized dashboard");
    }

    public static void main(String[] args) {
        AdminUser au = new AdminUser("ekansh" , "ekansh@gmail.com");
        au.login();
        au.showDashboard();
    }
}
