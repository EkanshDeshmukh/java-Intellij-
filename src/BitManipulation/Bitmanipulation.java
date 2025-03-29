public class Bitmanipulation {

    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static int getIthBit(int n, int i){
        int bitMask = 1 << i;
        if((n & bitMask) == 0){
            return 0;
        }else {
            return 1;
        }
    }
    public static int setIthBit(int n,int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }
    public static int clearIthBit(int n,int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n , int i,int newBitMask){
        n = clearIthBit(n,i);
        int bitMask = newBitMask<<i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        oddOrEven(4);
        System.out.println( getIthBit(10,3));
        System.out.println( setIthBit(10,2));
        System.out.println( clearIthBit(10,1));
        System.out.println( updateIthBit(10,2,1));

    }
}
