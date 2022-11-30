package week11.day3;

public class Pro12916 {
    public static boolean sol(String s) {
        //문자열 내 p와 y의 개수
        //p와 y의 개수가 같으면 true, 다르면 false 리턴

        int countP = 0; //p의 개수
        int countY = 0; //y의 개수

        for (int i = 0; i < s.length(); i++) {
            if ('p' == s.charAt(i) || 'P' == s.charAt(i)) {
                //문자열에 p혹은 P가 있으면
                countP++;
            } else if ('y' == s.charAt(i) || 'Y' == s.charAt(i)) {
                countY++;
            }
        }

        if (countP == countY) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(sol("pPoooY"));
    }
}
