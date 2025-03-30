package BitManipulation;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 4;
         if ((n & (n-1)) == 0){
             System.out.println("power of two");
         }else{
             System.out.println("no");
         }
    }
}
