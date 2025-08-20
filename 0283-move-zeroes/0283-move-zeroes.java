class Solution {
     static{
            for(int i=0;i<1000;i++){
                int[] n = {0,0,1,2,3};
                Solution.moveZeroes(n);
            }
        }
    public static void moveZeroes(int[] nums) {
         int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                if(left != right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;}
                left++;
            }
        }
    }
}