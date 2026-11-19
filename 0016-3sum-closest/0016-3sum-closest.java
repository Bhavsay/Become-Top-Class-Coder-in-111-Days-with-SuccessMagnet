class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int close_sum = Integer.MAX_VALUE / 2; 
        
        for (int i = 0; i < nums.length - 2; ++i) {
            for (int j = i + 1; j < nums.length - 1; ++j) {
                for (int k = j + 1; k < nums.length; ++k) {
                    int current_sum = nums[i] + nums[j] + nums[k];
                    if (Math.abs(current_sum - target) < Math.abs(close_sum - target)) {
                        close_sum = current_sum;
                    }
                }
            }
        }
        
        return close_sum;
    }
}