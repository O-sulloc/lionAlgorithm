package week8.day2;

import java.util.Scanner;

public class SimpleSearch {
    public static void main(String[] args) {
        //데이터 개수, 데이터, 찾는 데이터 입력됨
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int find = sc.nextInt();
        int result = -1;

        for (int i = 0; i < n; i++) {
            if (find == numbers[i]) {
                result = i+1;
            }
        }

        System.out.println(result);
    }


}
