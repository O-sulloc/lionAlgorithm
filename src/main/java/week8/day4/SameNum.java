package week8.day4;

import java.util.ArrayList;

public class SameNum {
    public int[] solution(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();

        int num = -1; //0~9

        al.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            num = al.get(al.size()-1);
            if (num != arr[i]) {
                al.add(arr[i]);
            }
        }

        int[] result = new int[al.size()];

        for (int i = 0; i < al.size() ; i++) {
            result[i] = al.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        SameNum sn = new SameNum();

        int arr[] = {1, 1, 3, 3, 0, 1, 1};
        sn.solution(arr);
    }
}
