class Solution {
    public int minimumK(int[] nums) {
        int left = 1;
        int right = 200000;
        int ans = right;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(check(nums, mid)){
                ans = mid;
                right = mid - 1;
            }else
                left = mid + 1;
        }

        return ans;
    }

    private boolean check(int[] nums, int k){
        long oper = 0;
        long limit = (long) k * k;

        for(int x: nums){
            oper += (x + k - 1) / k;

            if(oper > limit)
                return false;
        }

        return oper <= limit;
    }
}