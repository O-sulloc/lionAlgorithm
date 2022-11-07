package week8.day1;

public class Harshad {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        int ori = x;

        //자릿수 합 구하기
        while (x > 0) {
            sum += x % 10;
            //System.out.println(x % 10);
            x = x / 10;
        }

        //하샤드 수인지 판별
        if (ori % sum == 0) {
            answer = true;
        }

        return answer;
    }

    public static void main(String[] args) {
        Harshad harshad = new Harshad();
        harshad.solution(687);
    }
}
