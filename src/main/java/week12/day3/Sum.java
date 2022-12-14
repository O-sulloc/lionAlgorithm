package week12.day3;

import java.util.Arrays;

public class Sum {

    public static void main(String[] args) {
        int[] coins = {2, 7, 40, 19};
        int[][] dp = new int[coins.length][coins.length];

        int i = 0;

        for (int j = 0; j < coins.length; j++) {
            if(j == 0 ){
                dp[i][j] = coins[0];
            }else{
                dp[i][j] = dp[i][j-1] + coins[1];
            }
        }

        System.out.println(Arrays.toString(dp[i]));
    }
}
