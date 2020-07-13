import java.util.Arrays;

/*
最长上升子序列
 */

class LIS {
    public static int [] lengthOfLIS(int[] nums) {
        int n=nums.length;
        int [] dp=new int[n];
        Arrays.fill(dp,1);
        for (int i=1;i<n;i++){
            for (int j=0;j<i;j++){
                if (nums[j]<nums[i]&&dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                }
            }
        }
        int l=0;
        for (int i = 0; i <n ; i++) {
            l=Math.max(l,dp[i]);
        }
        return dp;
    }
}