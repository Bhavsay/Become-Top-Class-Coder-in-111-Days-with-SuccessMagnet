class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // Solution 1 (Brute Force)

        int n = nums.length; 
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int otarget = nums[i]+nums[j];

                if(otarget == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}