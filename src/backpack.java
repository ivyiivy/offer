public class backpack {
    public int maxValue(int[] w, int[] v, int cap) {
        // write code here
        int[][] dp = new int[w.length + 1][cap + 1];

        // 第一行和第一列不用赋初值，因为都是0
        for (int i = 1; i <= w.length; i++) {
            for (int j = 1; j <= cap; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= w[i - 1]) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i - 1]] + v[i - 1]);
                }
            }
        }

        int maxValue = dp[w.length][cap];// 获取的最大价值
        return maxValue;
    }
}

