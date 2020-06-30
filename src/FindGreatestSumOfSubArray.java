public class FindGreatestSumOfSubArray {
    /*
    找到数组最大连续子序列和
     */
    public int findGreatestSumOfSubArray(int[] array) {
        if(array.length==0){
            return 0;
        }
        int []dp=new int[array.length];
        dp[0]=array[0];
        int maxSum=dp[0];
        for(int i=0;i<array.length-1;i++){
            if(dp[i]>0){
                dp[i+1]=dp[i]+array[i+1];
            }
            else{
                dp[i+1]=array[i+1];
            }
            if(dp[i+1]>maxSum){
                maxSum=dp[i+1];
            }
        }

        return maxSum;
    }
}