package week7.day1;

import java.util.Arrays;

public class BruteForce {
    public int solution(int[] answers) {
        //int[] 받아서 Int[] 리턴하는 메서드

        /*test case
        문제 1. 답지[1,2,3,4,5]	가장 많이 맞춘(5문제) 학생 [1]번 수포자 학생
        문제 2. 답지[1,3,2,4,2]	[1,2,3]번 학생이 각각 2문제씩 맞음
         */

        /*
        1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
            1트: 5문제 맞 / 2트:2문제 맞
        2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
            1트: 0 / 2트: 2
        3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
            1트: 0 / 2트: 2
         */

        int[] stu1 = {1,2,3,4,5};
        int[] stu2 = {2,1,2,3,2};
        int[] stu3 = {3,3,1,1,2};
        int[] scores = {0,0,0};

        int cnt = 0; //첫번째 문제 답안체크해서 맞은 문제수 카운트

        for (int j = 0; j < 3; j++) {
            //학생 3명 반복하고 싶은데.........

            for (int i = 0; i < answers.length; i++) {
                if (answers[i] == stu1[i]) {
                    cnt++;
                }
                scores[0] = cnt;
            }
        }

        System.out.println(Arrays.toString(scores));
        return cnt;
    }

    public static void main(String[] args) {
        int[] firstAnswer = {1, 2, 3, 4, 5};

        BruteForce bf = new BruteForce();
        bf.solution(firstAnswer);
    }
}
