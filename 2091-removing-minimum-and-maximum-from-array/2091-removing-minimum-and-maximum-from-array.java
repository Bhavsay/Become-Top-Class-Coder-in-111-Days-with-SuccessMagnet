class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        if(nums.length == 1){
            return 1;
        }

        int n = nums.length;
        int minIdx = 0;
        int maxIdx = 0;

        for(int i=1; i<n; i++){
            if(nums[i]<nums[minIdx])
                minIdx = i;    
            if(nums[i]>nums[maxIdx]){
                maxIdx = i;
            }
        }

        int leftIdx = Math.min(minIdx, maxIdx);
        int rightIdx = Math.max(minIdx, maxIdx);

        int delfromleftonly = rightIdx + 1;
        int delfromrightonly = n - leftIdx;
        int delfrombothsides = (leftIdx+1) + (n-rightIdx);

        int ultimatemindel = Math.min(delfromleftonly, Math.min(delfromrightonly, delfrombothsides));

        return ultimatemindel;

    }
}