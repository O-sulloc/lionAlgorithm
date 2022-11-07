package week8.day1;

public class Harshad {
    public boolean solution(int x) {
        boolean answer = true;
        return answer;
    }

    public static void main(String[] args) {
        int x = 687;
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += x % 10;
            System.out.println(x % 10);
            x = x / 10;
        }
        System.out.println(sum);

        System.out.println(x/sum);
    }
}
