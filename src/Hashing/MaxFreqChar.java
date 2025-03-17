package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class MaxFreqChar {
    public static void main(String[] args) {
        System.out.println(maxFreqchar("aaakkasisaapps"));
    }

    private static char maxFreqchar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i<str.length(); i++){
            if(map.containsKey( str.charAt(i))){
                int of = map.get( str.charAt(i));
                int nf = of + 1;
                map.put( str.charAt(i) , nf);
            }
            else {
                map.put( str.charAt(i) , 1);
            }
        }
        System.out.println(map);

        char maxChar = ' ';
        int maxFreq = 0;
        for(char ch : map.keySet()){
            if(map.get(ch) > maxFreq){
                maxFreq = map.get(ch);
                maxChar = ch;
            }
        }

        return 'c';
    }


}
