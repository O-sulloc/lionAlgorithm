package week9.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class QuickSort {
    public List<Integer> study(List<Integer> arr) {
        // 1. 기준값 뽑기
        //int idx = arr.length / 2; // 8/2=4
        int pivot = arr.get(arr.size() / 2); //arr[4] = 5

        // 2. 왼쪽, 오른쪽으로 나누어 담는 로직 구현
        List<Integer> left = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < pivot) {
                left.add(arr.get(i));
            } else if (arr.get(i) > pivot) {
                right.add(arr.get(i));
            }
        }

        //return left.sort(Comparator.naturalOrder()) + mid + right.sort(Comparator.naturalOrder());
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {20, 18, 5, 19, 5, 25, 40, 50};
        List<Integer> al = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }

        QuickSort qs = new QuickSort();
        qs.study(al);
    }
}
