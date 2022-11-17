package week9.day4;

import java.util.Arrays;

public class QuickSortArray {
    public int[] sort(int[] arr, int startIdx, int endIdx) {

        int leftIdx = startIdx; //왼쪽 인덱스
        int rightIdx = endIdx; //오른쪽 인덱스

        // 1. 기준값 뽑기
        int pivot = arr[(startIdx+endIdx) / 2];


        while (leftIdx <= rightIdx) {
            while (arr[leftIdx] < pivot) leftIdx += 1;
            while (arr[rightIdx] > pivot) rightIdx -= 1;
            if (leftIdx <= rightIdx) {
                int temp = arr[leftIdx];
                arr[leftIdx] = arr[rightIdx];
                arr[rightIdx] = temp;
                leftIdx += 1;
                rightIdx -= 1;
            }
            System.out.printf("leftIdx:%d rightIdx:%d\n", leftIdx, rightIdx);
            System.out.println(Arrays.toString(arr));
        }

        if(startIdx < rightIdx) sort(arr, startIdx, rightIdx);
        if(leftIdx < endIdx) sort(arr, leftIdx, endIdx);

        return arr;
    }

    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};
        QuickSortArray qs = new QuickSortArray();
        var r = qs.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(r));
    }
}
