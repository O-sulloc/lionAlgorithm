package week12.day1;

import java.util.Arrays;

public class MCPStudy {
    public static void sol(int[][] matrix) {
        // 1. 3*3 DP 만들기
        int[][] dp = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }


    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 2}, {4, 6, 2}, {1, 2, 4}};

        sol(matrix);
    }
}
