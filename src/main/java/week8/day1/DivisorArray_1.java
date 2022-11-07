package week8.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DivisorArray_1 {
    public int[] solution(int[] arr, int divisor) {
        PriorityQueue<Integer> list = new PriorityQueue(); //priority queue를 사용

        //나누어 떨어지는 수인지 판별
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        if (list.size() == 0) {
            return new int[]{-1};
        }

        int[] answer = new int[list.size()];
        int idx = 0;
        while(!list.isEmpty()){
            answer[idx++] = list.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        DivisorArray da = new DivisorArray();
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        da.solution(arr, divisor);
    }
}
