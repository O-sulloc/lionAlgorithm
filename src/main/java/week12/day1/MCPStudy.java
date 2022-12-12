package week12.day1;

import java.util.Arrays;

public class MCPStudy {
    public static void sol(int[][] matrix) {
        // 1. 3*3 DP 만들기
        int[][] dp = new int[matrix.length][matrix[0].length];

        // 2. (0,0) 채우기
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0 && j == 0) {
                    //(0,0) 넣는 로직
                    dp[i][j] = matrix[i][j];
                } else if (i == 0 && j > 0) {
                    //첫행만 있을 경우 (0,0), (0,1), (0,2)
                    dp[i][j] = dp[i][j - 1] + matrix[i][j];

                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 2}, {4, 6, 2}, {1, 2, 4}};

        sol(matrix);
    }
}
