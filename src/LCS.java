
public class LCS {
    public Integer lcs(String a, String b) {
        int m = a.length();
        int n = b.length();
        int len[][] = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    len[i][j] = len[i - 1][j - 1] + 1;
                } else if (len[i - 1][j] >= len[i][j - 1]) {
                    len[i][j] = len[i - 1][j];
                } else {
                    len[i][j] = len[i][j - 1];
                }

            }
        }
        return len[m][n];
    }

    public void getLCS(String A, String B) {
        int dp[][] = new int[A.length()][B.length()];

        dp[0][0] = A.charAt(0) == B.charAt(0) ? 1 : 0;

        for (int i = 1; i < B.length(); i++) {
            dp[0][i] = Math.max(dp[0][i - 1], A.charAt(0) == B.charAt(i) ? 1 : 0);  //不需要建立m+1和n+1的数组，先对第一列和第一行初始化即可
        }

        for (int i = 1; i < A.length(); i++) {
            dp[i][0] = Math.max(dp[i - 1][0], A.charAt(i) == B.charAt(0) ? 1 : 0);
        }

        for (int i = 1; i < A.length(); i++) {
            for (int j = 1; j < B.length(); j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                if (A.charAt(i) == B.charAt(j)) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + 1);
                }
            }
        }

    }
}
