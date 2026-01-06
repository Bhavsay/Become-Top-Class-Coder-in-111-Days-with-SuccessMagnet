import java.util.*;

class Solution {
    public static ArrayList<ArrayList<Integer>> triplets(int[] nums) {
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        // If array has less than 3 elements
        if (nums == null || nums.length < 3) return res;
        
        // Sort the array
        Arrays.sort(nums);
        
        // Fix first element one by one
        for (int i = 0; i < nums.length - 2; i++) {
            
            // Skip duplicate elements
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int left = i + 1;
            int right = nums.length - 1;
            
            // Two-pointer approach
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    res.add(new ArrayList<>(Arrays.asList(
                        nums[i], nums[left], nums[right]
                    )));
                    
                    // Skip duplicates for left and right
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    left++;
                    right--;
                } 
                else if (sum < 0) {
                    left++;
                } 
                else {
                    right--;
                }
            }
        }
        
        return res;
    }
}
