package week5.day5.algo;

public class Solution {
    boolean solveBracket(String s) {
        boolean answer = true;

        while(s.indexOf("()") > 0){
            s = s.replace("()","");
        }

        return answer;
    }

}
