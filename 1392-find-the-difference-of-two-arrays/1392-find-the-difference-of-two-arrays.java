import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

       HashSet<Integer> set1 = new HashSet<>();
       HashSet<Integer> set2 = new HashSet<>();

       for(int num : nums1){
        set1.add(num);
       }
       for(int num : nums2){
        set2.add(num);
       }

       HashSet<Integer> Set1 = new HashSet<>(set1);
       HashSet<Integer> Set2 = new HashSet<>(set2);

       Set1.removeAll(set2);
       Set2.removeAll(set1);

       List<Integer> list1 = new ArrayList<>(Set1);
       List<Integer> list2 = new ArrayList<>(Set2);

       ArrayList<List<Integer>> result = new ArrayList<>();
       result.add(list1);
       result.add(list2);

       return result;
    }
}
