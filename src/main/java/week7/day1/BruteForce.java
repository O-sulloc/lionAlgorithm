package week7.day1;

import java.util.ArrayList;
import java.util.Arrays;

public class BruteForce {
    public int[] solution(int[] answers) {
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

        int[] stu1 = {1, 2, 3, 4, 5};
        int[] stu2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] stu3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = {0, 0, 0};
        int[] answer = {};

        int cnt = 0; //첫번째 문제 답안체크해서 맞은 문제수 카운트

        for (int i = 0; i < answers.length; i++) {
            if (stu1[i % stu1.length] == answers[i]) scores[0]++;
            if (stu2[i % stu1.length] == answers[i]) scores[1]++;
            if (stu3[i % stu1.length] == answers[i]) scores[2]++;
        }

        int maxScore = Math.max(Math.max(scores[0], scores[1]), scores[2]);
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (maxScore == scores[0]) list.add(1);
        if (maxScore == scores[1]) list.add(2);
        if (maxScore == scores[2]) list.add(3);

        answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        //int[] firstAnswer = {1, 2, 3, 4, 5};
        int[] secondAnswer = {1, 3, 2, 4, 2};

        BruteForce bf = new BruteForce();
        bf.solution(secondAnswer);
    }
}
