package week11.day4;

import java.util.ArrayList;
import java.util.Collections;

public class Pro138477 {
    public static int[] sol(int k, int[] score) {
        // 매일 한 명의 가수가 노래를 부름. 상위 k번째 이내 점수 받으면 명예의 전당에 오름.
        int[] answer = new int[score.length];
        ArrayList<Integer> fameList = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            if (fameList.size() < k) {
                fameList.add(score[i]);
                Collections.sort(fameList); //순차적으로 정렬해
                answer[i] = fameList.get(0); //최소 점수 리턴해줘야 함.

            } else if (fameList.size() == k) {
                int min = fameList.get(0); //첫번째 수

                if(min < score[i]){
                    fameList.remove(0); //새로 노래 부른 가수의 점수보다 명예의 전당 첫번재 점수가 낮으면 그 인덱스 삭제
                    fameList.add(score[i]); //새로 노래 부른 가수의 점수를 넣어
                    Collections.sort(fameList); //순차적으로 정렬해
                }
                answer[i] = fameList.get(0); //최소 점수 리턴해줘야 함.
            }
        }
        //System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        sol(k, score);
    }
}
