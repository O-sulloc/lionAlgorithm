package week6.day1;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthNum2 {
    /*
    1. *부터 *까지 배열 자르기
    2. 잘라서 가져온 배열을 정렬하기
    3. 거기서 *번째 값만 가져오기
     */
    public int getkthNum(int[] arr, int[] command){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = command[0]-1; i < command[1]; i++) {
            pq.add(arr[i]);
        }
        int result = 0;
        for (int i = 0; i < command[2]; i++) {
            result = pq.poll();
        }
        return result;
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length ; i++) {
            answer[i] = getkthNum(array,commands[i]);
        }
        return answer;
   }

    public static void main(String[] args) {
        KthNum2 kthNum = new KthNum2();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands =new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = kthNum.solution(array, commands);
        kthNum.solution(array, commands);
        System.out.println(Arrays.toString(answer));

        //int[] arr1 = Arrays.copyOfRange(array,2-1,5); //5,2,6,3 출력
        //System.out.println(Arrays.toString(arr1));

    }
}
