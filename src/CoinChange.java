import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;

public class CoinChange {
    /*
    给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
示例 1:

输入: coins = [1, 2, 5], amount = 11
输出: 3
解释: 11 = 5 + 5 + 1

     */
    public int coinChange(int[] coins, int amount) {
        if(amount<=0){
            return -1;
        }
        int []dp=new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for (int i=1;i<=amount;i++){
            for (int coin:coins){
                if (i>=coin&&dp[i-coin]!=Integer.MAX_VALUE){
                    dp[i]=Math.min(dp[i-coin]+1,dp[i]);
                }
            }
        }
        if (dp[amount]==Integer.MAX_VALUE){
            return -1;
        }
        return dp[amount];
    }
}
