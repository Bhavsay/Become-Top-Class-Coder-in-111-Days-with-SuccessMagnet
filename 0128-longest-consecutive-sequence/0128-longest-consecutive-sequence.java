class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int lgs = 0;
        for(int num: set){
            if(!set.contains(num-1)){
                int cn = num;
                int cs = 1;

                while(set.contains(cn+1)){
                    cn++;
                    cs++;
                }
                lgs = Math.max(cs, lgs);
            }
        }
        return lgs;
    }
}