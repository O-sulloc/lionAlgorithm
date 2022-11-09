package week8.day3;

import java.util.Arrays;
import java.util.function.BiFunction;

public class SelectionSort {

    public void selectionSort(int[] arr, BiFunction<Integer, Integer, Boolean> bFn) {
        for (int i = 0; i < arr.length - 1; i++) {
            int swapIdx = i;
            int temp = 0;

            for (int j = i; j < arr.length; j++) {
                if (bFn.apply(arr[j], arr[swapIdx])) {
                    swapIdx = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[swapIdx];
            arr[swapIdx] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        selectionSort.selectionSort(arr, (a, b) -> a < b);// 오름차순 정렬
        selectionSort.selectionSort(arr, (a, b) -> a > b);// 내림차순 정렬
    }
}