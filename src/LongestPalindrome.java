import java.util.HashMap;

/*
最长回文子串：动态规划求法

要点：1.找状态转移
     2.找边界条件
     3.注意填表顺序，不可将未初始化的表项作为参考值

 */
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        HashMap map=new HashMap();

        int[][] dp = new int[s.length() ][s.length()];
        int begin=0;
        int maxlen=1;
        for (int i=0;i<s.length();i++){
            dp[i][i]=1;
        }
        for (int j= 1; j < s.length(); j++) {
            for (int i= 0; i< j; i++) {
                boolean b = s.charAt(i) == s.charAt(j);
                if (j == i + 1 && b) {
                    dp[i][j] = 1;
                } else if (dp[i + 1][j - 1] == 1 && b){
                    dp[i][j]=1;
                }
                if (dp[i][j]==1&&j-i+1>maxlen){
                    maxlen=j-i+1;
                    begin=i;
                }
            }
        }
        return s.substring(begin,begin+maxlen-1);
    }
}
