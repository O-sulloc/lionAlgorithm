package week8.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisorArray {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        //나누어 떨어지는 수인지 판별
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]); //나누어 떨어지는 수라면 list에 추가
            }
        }

        if (list.size() == 0) {
            return new int[]{-1}; //list에 아무 숫자도 안 들어갔으면 -1 리턴
        }

        // list를 array로 바꿈
        int[] answer = new int[list.size()]; //list 길이 만큼 array 생성하기
        for (int i = 0; i < list.size(); i++) {
            //list 길이만큼 반복
            //뭐를? list에 있는 원소를 array로 옮기는 행위를 반복
            answer[i] = list.get(i);
        }

        Arrays.sort(answer); //정렬

        return answer;
    }

    public static void main(String[] args) {
        DivisorArray da = new DivisorArray();
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        da.solution(arr, divisor);
    }
}
