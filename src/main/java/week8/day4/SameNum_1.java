package week8.day4;

import java.util.ArrayList;
import java.util.Stack;

public class SameNum_1 {
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> arStack = new Stack<>();

        arStack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if(arStack.peek() != arr[i]){
                arStack.push(arr[i]);
            }
        }

        return arStack;
    }

    public static void main(String[] args) {
        SameNum_1 sn = new SameNum_1();

        int arr[] = {1, 1, 3, 3, 0, 1, 1};
        sn.solution(arr);
    }
}
