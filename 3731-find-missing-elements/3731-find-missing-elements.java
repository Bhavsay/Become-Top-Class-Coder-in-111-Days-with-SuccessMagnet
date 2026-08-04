class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();

        Arrays.sort(nums);
        int s = nums[0];
        int l = nums[nums.length-1];

        for(int i=s; i<=l; i++){
            res.add(i);
        }
        for(int i=0; i<nums.length; i++){
            if(res.contains(nums[i])){
                res.remove(Integer.valueOf(nums[i]));
            }
        }
        return res;
    }
}