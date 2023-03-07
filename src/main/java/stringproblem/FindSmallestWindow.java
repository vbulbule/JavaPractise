package stringproblem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindSmallestWindow {

    public static void main(String[] args) {
        String str = "aabcbcdbca";
        System.out.println(getSmallestWindow(str));
    }

    public static String getSmallestWindow(String str){
        String smallestWindow="";
        Map<Character, Integer> m = new HashMap<>();
        for(int i =0 ; i < str.length();i++){
            m.put(str.charAt(i),i);
        }
        System.out.println(m);


        return smallestWindow;
    }



}
