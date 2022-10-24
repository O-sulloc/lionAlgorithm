package week6.day1;

import java.util.Arrays;

public class KthNum {
    /*
    1. *부터 *까지 배열 자르기
    2. 잘라서 가져온 배열을 정렬하기
    3. 거기서 *번째 값만 가져오기
     */

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for(int[] command:commands){
            int[] sliceArr = Arrays.copyOfRange(array,command[0]-1, command[1]);
            Arrays.sort(sliceArr);
            answer[idx++] = sliceArr[command[2]-1];
        }
        return answer;
   }

    public static void main(String[] args) {
        KthNum kthNum = new KthNum();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands =new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = kthNum.solution(array, commands);
        kthNum.solution(array, commands);
        System.out.println(Arrays.toString(answer));

        //int[] arr1 = Arrays.copyOfRange(array,2-1,5); //5,2,6,3 출력
        //System.out.println(Arrays.toString(arr1));

    }
}
