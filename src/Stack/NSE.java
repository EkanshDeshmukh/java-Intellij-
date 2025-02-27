package Stack;

import java.util.Stack;

public class NSE {
    public static void main(String[] args) {
        int [] arr= {4,5,2,25};

        int [] res = nse(arr);
        for(int ans : res){
            System.out.println(ans);
        }
    }
    public static int[] nse(int[]arr){
        int n = arr.length;
        int [] output =new int[n];
        Stack<Integer> st= new Stack<>();
        for(int i = 0; i<n; i++){
            output[i] = -1;
        }
        for(int i = 0; i<n; i++){
            while(!st.isEmpty() && arr[i] < arr[st.peek()]){
            output[st.pop()] = arr[i];
            }
            st.push(i);
        }
        return output;
    }
}
