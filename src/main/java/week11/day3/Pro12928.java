package week11.day3;

import java.util.ArrayList;
import java.util.List;

public class Pro12928 {
    //정수 n을 입력받아 N의 약수를 모두 더한 값을 리턴

    public static int solution(int n) {
        List nums = new ArrayList<>();
        int sum = 0;
        for (int i = 1; i < 3000; i++) {
            if (n % i == 0) {
                nums.add(i); //i가 약수
            }
        }

        for (int i = 0; i < nums.size(); i++) {
            sum += (int) nums.get(i);
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(solution(12));
    }
}
