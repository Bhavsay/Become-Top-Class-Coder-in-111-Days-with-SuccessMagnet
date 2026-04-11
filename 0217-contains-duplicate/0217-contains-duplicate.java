class Solution {
    public boolean containsDuplicate(int[] nums) {
        
         HashMap<Integer, Integer> map = new HashMap<>();

        for (int j = 0; j < nums.length; j++) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
        }

        for (int value : map.values()) {
            if (value > 1) {
                return true;
            }
        }

        return false; 
    }
}