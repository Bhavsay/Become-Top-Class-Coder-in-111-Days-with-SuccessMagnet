import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Step 1: Create sets from both arrays
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }

        // Step 2: Create copies to find unique elements
        HashSet<Integer> onlyInNums1 = new HashSet<>(set1);
        HashSet<Integer> onlyInNums2 = new HashSet<>(set2);

        // Step 3: Remove common elements
        onlyInNums1.removeAll(set2);  // Elements only in nums1
        onlyInNums2.removeAll(set1);  // Elements only in nums2

        // Step 4: Convert sets to lists
        List<Integer> list1 = new ArrayList<>(onlyInNums1);
        List<Integer> list2 = new ArrayList<>(onlyInNums2);

        // Step 5: Add both lists to result
        List<List<Integer>> result = new ArrayList<>();
        result.add(list1);
        result.add(list2);

        return result;
    }
}
