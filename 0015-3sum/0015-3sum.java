import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length<3) return new ArrayList<>();

        //sort the element
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        
        //Now fixed the first element and find out other two element
        for(int i=0; i<nums.length-2; i++){

            int left = i+1;
            int right = nums.length-1;


            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else
                    right--;
            }
        }
        return new ArrayList<>(result);
    }
}

// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> res = new ArrayList<>();
//         Arrays.sort(nums);

//         for (int i = 0; i < nums.length; i++) {
//             if (i > 0 && nums[i] == nums[i-1]) {
//                 continue;
//             }
            
//             int j = i + 1;
//             int k = nums.length - 1;

//             while (j < k) {
//                 int total = nums[i] + nums[j] + nums[k];

//                 if (total > 0) {
//                     k--;
//                 } else if (total < 0) {
//                     j++;
//                 } else {
//                     res.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                     j++;

//                     while (nums[j] == nums[j-1] && j < k) {
//                         j++;
//                     }
//                 }
//             }
//         }
//         return res;        
//     }
// }

// import java.util.*;

// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> res = new ArrayList<>();
//         Arrays.sort(nums);

//         for (int i = 0; i < nums.length - 2; i++) {
//             if (i > 0 && nums[i] == nums[i - 1]) continue;

//             int left = i + 1, right = nums.length - 1;
//             while (left < right) {
//                 int total = nums[i] + nums[left] + nums[right];
//                 if (total == 0) {
//                     res.add(Arrays.asList(nums[i], nums[left], nums[right]));
//                     while (left < right && nums[left] == nums[left + 1]) left++;
//                     while (left < right && nums[right] == nums[right - 1]) right--;
//                     left++;
//                     right--;
//                 } else if (total < 0) {
//                     left++;
//                 } else {
//                     right--;
//                 }
//             }
//         }

//         return res;
//     }
// }