class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        if(k<n){
            k=k%n;
        }
        if(k==n){
            System.out.println(nums);
        }
        if(k>n){
            k=k%n;
        }
        // k = k%n;  //


        reverse(nums, 0,nums.length-1);
        reverse(nums,0, k-1);
        reverse(nums,k, nums.length-1);
    }

       
    public void reverse(int[] nums, int left, int right){
       
        while(left<right) {
            int temp = nums[left];
            nums[left]= nums[right];
            nums[right]= temp;
            left++;
            right--;
        }
        
    }
   
}