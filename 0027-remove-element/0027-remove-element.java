class Solution {
    public int removeElement(int[] nums, int val) {

        // for(int i=nums.length-1; i>=0; i--){
        //     if(arr[i])
        // }
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;  
    }
}