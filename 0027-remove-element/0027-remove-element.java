class Solution {
    public int removeElement(int[] nums,int val){
        int k=0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] !=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k; 
    }
}



// class Solution {
//      public static void swap(int arr[],int start, int end) {
//         int temp = 0;
//         temp = arr[start];
//         arr[start] = arr[end];
//         arr[end] = temp;
//     }
//     public int removeElement(int[] nums, int val) {
//         int i = 0, j = nums.length - 1;
//         while (i <= j){
//             if (nums[i] == val) {
//                 if (nums[j] == val) {
//                     j--;
//                 }else {
//                     swap(nums, i, j);
//                     j--;
//                     i++;
//                 }
//             } else {
//                 i++;
//             }
//         }
//         return i;
//     }
// }


// class Solution {
//     public int removeElement(int[] nums, int val) {

//         // for(int i=nums.length-1; i>=0; i--){
//         //     if(arr[i])
//         // }
//         int k = 0;

//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] != val) {
//                 nums[k] = nums[i];
//                 k++;
//             }
//         }
//         return k;  
//     }
// }