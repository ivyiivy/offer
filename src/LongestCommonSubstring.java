public class LongestCommonSubstring {
    public int getLength(String a, String b) {
        int m = a.length();
        int n = b.length();
        int dp[][] = new int[m][n];
        dp[0][0] = a.charAt(0) == b.charAt(0) ? 1 : 0;
        for (int i=1;i<m;i++){
            if (a.charAt(i)==b.charAt(0))
                dp[i][0]=1;
        }
        for (int i=1;i<n;i++){
            if (a.charAt(0)==b.charAt(i))
                dp[0][i]=1;
        }
        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                if (a.charAt(i)==b.charAt(j))
                    dp[i][j]=dp[i-1][j-1]+1;
            }
        }
        int max=0;
        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                if (dp[i][j]>max)
                    max=dp[i][j];
            }
        }
        return max;
    }
}
