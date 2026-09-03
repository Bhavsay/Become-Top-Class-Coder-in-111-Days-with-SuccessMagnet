class Solution {

    // for DP learning, remember this pattern 
    // Most Top-down DP / Memoization problems follow this structure:

    public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        return helper(n,dp);
    }
    public int helper(int n, int[] dp){

        // 1. Base case 
        if(n<=1) return n;

        // 2. Already calculated
        if(dp[n] != -1){
            return dp[n];
        }

        // 3. calculate + store
        return dp[n] = helper(n-1, dp) + helper(n-2,dp);

    }
}
