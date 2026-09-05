class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;

        if(n==k){
            int max = 0;
            for(int num : nums){
                max = Math.max(max,num);
                
            }
            return max;
        }

        int[] count = new int[51];
        int res = -1;

        for(int x: nums){
            count[x]++;
        }

        if(k==1){
            for(int i=50; i>=0; i--){
                if(count[i] == 1){
                    return i;
                }
            }
        }

        if(count[nums[0]]==1){
            res = Math.max(res, nums[0]);
        }

        if(count[nums[n-1]] == 1){
            res = Math.max(res, nums[n-1]);
        }

        return res;

    }
}