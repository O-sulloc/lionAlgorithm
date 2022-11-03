package week7.day4;

import java.util.Arrays;

public class PrimeEra {
    //2, 2
    //3, 4
    //4, 6
    //5, 8
    //… 을 출력 해보세요 multipleOf가 100까지

    public static void main(String[] args) {
        int n = 50; //n=50
        int[] nums = new int[n - 1]; //nums=49 (2~50)
        boolean[] checks = new boolean[nums.length]; //nums수만큼 배열 생성
        Arrays.fill(checks, true); //배열을 True로 초기화, 왜냐하면 기본값이 false이기 때문

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 2;
        }

        int multipleOf = 2;

        for (int i = 2; i < nums.length; i += 2) {
            //2씩 증가
            checks[i] = false; //2를 제외한 짝수를 지운다(false를 넣는다.)
        }

        for (int i = 0; i < checks.length; i++) {
            System.out.println(checks[i]);
        }

    }
}
