class Solution {
    public int sumOfSquares(int[] nums) {

        int res = 0, n = nums.length, i=1;

        for(int num : nums){

            if(n%i==0){

                res += num*num;
            }

            i++;
        }
        
        return res; 
    }
}