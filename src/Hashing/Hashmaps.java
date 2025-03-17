package Hashing;

import java.util.HashMap;

public class Hashmaps {
    public static void main(String[] args) {
        HashMap<String , Integer> languages = new HashMap();
        //add an elem
        languages.put("java",10);
        languages.put("cpp",20);
        System.out.println(languages.get("java"));
        System.out.println(languages.entrySet());
        languages.replace("cpp",22);
        languages.remove("java");
        System.out.println(languages);

    }
}
