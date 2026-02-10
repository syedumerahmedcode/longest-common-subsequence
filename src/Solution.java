public class Solution {

    public int longestCommonSubsequence(String text1, String text2) {
        /**
         * solved using dynamic programming
         */
        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    // diagonal value gets incremented
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    //max of either just above or just left cell
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        // last cell will always have the answer in our constructed logic
        return dp[m][n];        
    }
}
