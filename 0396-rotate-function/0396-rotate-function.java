class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;

        long sum = 0;
        long currRotVal = 0;

        for(int i=0; i<n; i++){
            sum += nums[i];
            currRotVal += (long)i*nums[i];
        }

        long result = currRotVal;
        for(int k=1; k<n; k++){
            currRotVal = currRotVal + sum - (long)n*nums[n-k];
            result = Math.max(result, currRotVal);
        }

        return (int)result;
        
    }
}