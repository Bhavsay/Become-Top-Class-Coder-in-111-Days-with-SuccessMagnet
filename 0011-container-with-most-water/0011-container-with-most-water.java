class Solution {
    public int maxArea(int[] height) {
        int lp = 0, rp = height.length-1, maxWater = 0;
        while(lp<rp){
            int w = rp - lp;
            int ht = Math.min(height[lp], height[rp]);
            int cw = w*ht;

            maxWater = Math.max(maxWater, cw);

            if(height[lp]<height[rp]){
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

}