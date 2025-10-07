class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int element : nums){
            map.put(element,map.getOrDefault(element,0)+1);
        }
        int greater = 0;
        for(int element : nums){
            if(map.get(element)>1){
                return true;
            }
        }
        return false;
    }
}