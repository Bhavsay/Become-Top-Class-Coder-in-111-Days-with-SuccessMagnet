class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0, prefsum=0, result=0;
        map.put(0,1);
        for(int num : nums){
            if(num%2!=0){
                prefsum++;
            }
            if(map.containsKey(prefsum-k)){
                count+=map.get(prefsum-k);
            }
            map.put(prefsum,map.getOrDefault(prefsum,0)+1);
        }
        return count;
    }
    
}