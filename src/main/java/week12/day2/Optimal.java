package week12.day2;

public class Optimal {
    int left;
    int right;

    public Optimal(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "Optimal{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    public static void main(String[] args) {
        int[] coins = {2, 7, 40, 19};
        Optimal[][] dp = new Optimal[coins.length][coins.length]; //4*4

        // 동전이 한 개만 있는 경우, dp에 값 넣기
        // 2, 7, 40, 19
        for (int i = 0; i < coins.length; i++) {
            dp[i][i] = new Optimal(coins[i], 0);
            //(0,0), (1,1) ... 대각선으로 넣기
        }

        // 동전이 두 개 있는 경우, dp에 값 넣기
        for (int i = 0; i < coins.length - 1; i++) {
            System.out.printf("%d %d %d %d\n", i, i + 1, coins[i], coins[i + 1]);
            int left = Math.max(coins[i], coins[i + 1]); //둘 중 큰 수를 left에
            int right = Math.min(coins[i], coins[i + 1]); //작은 수를 right에
            dp[i][i + 1] = new Optimal(left, right);
            System.out.println(dp[i][i + 1].toString());
        }

//        for (int i = 0; i < coins.length; i++) {
//            System.out.println(dp[i][i].toString());
//        }
    }
}
