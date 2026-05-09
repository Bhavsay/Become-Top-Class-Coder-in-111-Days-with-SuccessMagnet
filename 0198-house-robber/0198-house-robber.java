class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        int[] dynpro = new int[n];

        dynpro[0] = nums[0];
        dynpro[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            dynpro[i] = Math.max(dynpro[i - 1], nums[i] + dynpro[i - 2]);
        }

        return dynpro[n - 1]; 
    }
}