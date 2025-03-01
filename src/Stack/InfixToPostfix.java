package Stack;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
    System.out.print(infixToPostfix("A+B"));
    }
    public static int precedence(char c){
        if(c == '^'){
            return 3;
        }else if(c == '/' || c=='*'){
            return 2;
        }else if(c == '+' || c=='-'){
            return 1;
        }else{
            return 0;
        }
    }
    public static boolean isOperand(char c){
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'z') || (c >= '0' && c<='9')){
            return true;
        }
        return false;
    }

    public static String infixToPostfix(String exp){
        String postfix = new String("");
        Stack<Character> st =new Stack<>();
        for(int i =0; i<exp.length(); i++){
            char c = exp.charAt(i);
            if(isOperand(c)){
                postfix+= c;
            }else if(c == '('){
                st.push(c);
            }else if(c == ')'){
                while (st.peek() != '('){
                    postfix+=st.pop();
                }
            }else{
                while (!st.isEmpty() && precedence(c) <= precedence(st.peek())){
                    postfix+=st.pop();
                }
                st.push(c);
            }
        }
        while (!st.isEmpty()){
            postfix+=st.pop();
        }
        return postfix;
    }
}
