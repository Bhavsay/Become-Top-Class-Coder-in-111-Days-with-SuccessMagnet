class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int n = cost.length;

        int prev = cost[1];
        int prev2 = cost[0];

        for(int i=2; i<n; i++){
            int curr = cost[i] + Math.min(prev, prev2);
            prev2 = prev;
            prev = curr;
        }

        return Math.min(prev, prev2);

    }
}

// for(int i=stones.length-1; i>=0; i--){

//             int right = Integer.MAX_VALUE;

//             int[] dp = new int[stones.length];

//             if(i==0) return 0;

//             if(dp[i] != -1) return dp[i];

//             int left = stones[i-1]+(stones[i-1]+stones[i]);

//             if(i>1){
//                 right = stones[i-2]+(stones[i-2]+stones[i-1]);
//             }

//             return dp[i] = Math.min(left, right);