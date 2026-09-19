class Solution {
    public int maxJump(int[] stones) {

        if (stones.length == 2) {
            return stones[1]-stones[0];
        }

        int ans = 0;

        for (int i = 2; i < stones.length; i++) {
            int jump = stones[i] - stones[i - 2];

            ans = Math.max(ans, jump);
        }

        return ans; 

    }
}