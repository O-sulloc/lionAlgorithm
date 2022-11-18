package week9.day5;

public class Solution2 {
    public String solution(String s, int n) {
        //1. 문자열 쪼개서 배열에 담고
        //2. 아스키 코드로 반환하고 거기에 N 더하고
        //3. 배열을 다시 문자열로 출력
        //A~Z 65~90 //a~z 97~122 //space 32

        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') { //공백
                answer += ch;
                continue;
            }
            if (ch >= 'a' && ch <= 'z') { //소문자
                if (ch + n > 'z') {
                    answer += (char) (ch - 26 + n);
                } else {
                    answer += (char) (ch + n);
                }
            } else if (ch >= 'A' && ch <= 'Z') { //대문자
                if (ch + n > 'Z') {
                    answer += (char) (ch - 26 + n);
                } else {
                    answer += (char) (ch + n);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "AaZz";
        int n = 25;

        Solution2 solution = new Solution2();
        solution.solution(s, n);
    }
}
