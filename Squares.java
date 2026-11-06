class Solution {
    public int numSquares(int n) {

        int[] dp = new int[n + 1];

        // Initialize with maximum possible values
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
        }

        // Dynamic Programming
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j * j <= i; j++) {

                int square = j * j;

                dp[i] = Math.min(dp[i], 1 + dp[i - square]);
            }
        }

        return dp[n];
    }
}
