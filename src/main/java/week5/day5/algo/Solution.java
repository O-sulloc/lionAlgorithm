package week5.day5.algo;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    boolean solveBracket(String s) {
        boolean answer = true;

        /*
        while(s.indexOf("()") > 0){
            s = s.replace("()","");
        }
        // 효율성 테스트에서 실패
         */

        /*
        while(s.indexOf("()") > 0){
            String[] splitted = s.split("\\(\\)");
            s = String.join("",splitted);
        }
         */
        return s.length() == 0;
    }

    boolean bracket(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if ('(' == s.charAt(i)) {
                st.push(s.charAt(i));
            } else if (')' == s.charAt(i)) {
                if (st.empty()) {
                    return false; //비었으면 false return
                }
                st.pop();
            }
        }

        return st.empty();
    }

}
