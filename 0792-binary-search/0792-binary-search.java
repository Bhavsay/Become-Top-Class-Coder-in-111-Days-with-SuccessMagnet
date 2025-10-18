class Solution {
    public int search(int[] nums, int target) {
       int index = Arrays.binarySearch(nums,target);
       for(int n : nums){
        if(n==target){
            return index;
        }
       }
       return -1;
    }
}