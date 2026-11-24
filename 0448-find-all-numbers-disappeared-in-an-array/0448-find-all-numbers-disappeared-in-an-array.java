class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashSet<Integer> set =  new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        for(int i=1; i<=nums.length; i++){
            if(set.contains(i)){
                set.remove(i);
            }
            else {
                set.add(i);
            }
        }

        return new ArrayList<>(set);
    }
}