import java.util.*;

public class minCut {
    public static void main(String[] args) {
        System.out.println(minCut("aaa"));
    }

    public static int minCut(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for(int i=0; i<n; i++) {
            dp[i][i] = true;
        }
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++) {
                dp[j][i] = s.charAt(i) == s.charAt(j) && (dp[j+1][i-1] || j+1 > i-1);
            }
        }
        int[] ans = new int[n];
        Arrays.fill(ans, Integer.MAX_VALUE);
        for(int i=0; i<n; i++){
            if(dp[0][i]){
                ans[i] = 0;
            }
            else{
                for(int j=0; j<i; j++){
                    if(dp[j+1][i]){
                        ans[i] = Math.min(ans[j]+1, ans[i]);
                    }
                }
            }
        }
        return ans[n-1];
    }
}
