package week8.day2;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int target = 7; // 찾으려는 수

        //배열에서 중간값 찾기
        int midIndex = nums.length / 2;
        int midValue = nums[midIndex]; // 6

        int startIndex = 0; //배열의 시작점
        int endIndex = nums.length - 1; //배열의 끝점

        //인덱스(시작점, 끝점) 옮기기
        while(startIndex <= endIndex) {
            if (midValue > target) { // 중간값 > 찾는 값
                // 중간값이 찾는 값보다 크면, 중간값 이하의 수들을 다시 살펴봐야 함.
                endIndex = midIndex - 1;
            } else if (midValue < target) { //중간값 < 찾는 값
                startIndex = midIndex + 1;
            } else {
                //찾은 경우
                System.out.println(midIndex);
            }
        }

        //같은지 비교하기
    }
}
