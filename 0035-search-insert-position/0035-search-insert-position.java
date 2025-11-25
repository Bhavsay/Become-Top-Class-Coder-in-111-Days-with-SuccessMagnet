class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {

            // If we find the target OR find an element greater than target
            if (nums[i] >= target) {
                return i;
            }
        }

        // If target is bigger than all elements
        return nums.length;
    }
}