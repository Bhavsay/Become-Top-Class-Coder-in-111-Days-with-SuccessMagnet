class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // int count = 0;      
        // int maxCount = 0;   

        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == 1) {
        //         count++;                      
        //         maxCount = Math.max(maxCount, count);
        //     } else {
        //         count = 0;         
        //     }
        // }
        // return maxCount;
        

        int sum = 0; 
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                sum++; 
                ans = Math.max(ans, sum);
            } else {
                sum = 0; 
            }
        }
        return ans;
    }
}
