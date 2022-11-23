package week10.day2;

import java.util.ArrayList;
import java.util.List;

public class ReFibonacci {
    public int fib(int n) {
        //n = 1, 1
        //n = 2, 1
        //n = 3, 2
        //n = 4, 3

        if (n == 1 || n == 2) {
            return 1;
        }

        List<Integer> num = new ArrayList<>();

        num.add(1); //처음 들어가는 수
        num.add(1); //두번재 들어가는 수

        for (int i = 2; i < n; i++) {
            //앞에 1, 1 넣어줬으니까 2부터 시작
            num.add(num.get(i - 1) + num.get(i - 2)); // num[1] + num[2] = 1 + 2 = 3
        }
        return num.get(n - 1);
    }

    public static void main(String[] args) {
        int n = 6;
        ReFibonacci re = new ReFibonacci();
        System.out.println(re.fib(n));

/*
        List<Integer> num = new ArrayList<>();
        //n = 7, 1 1 2 3 5 8 13 (총 7개)
        // n = 8, 1 1 2 3 5 8 13 21 (총 8개)

        num.add(1); //처음 들어가는 수
        num.add(1); //두번재 들어가는 수

        for (int i = 0; i < n; i++) {
            num.add(num.get(i - 1) + num.get(i - 2)); // num[1] + num[2] = 1 + 2 = 3
        }

        int j = 0;
        num.add(1);

        j = 1;
        num.add(1);

        j = 2;
        num.add(num.get(0) + num.get(1)); // num[0] + num[1] = 1 + 1 = 2

        j = 3;
        num.add(num.get(1) + num.get(2)); // num[1] + num[2] = 1 + 2 = 3

 */
    }
}
