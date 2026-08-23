class Solution {
    public int maxArea(int[] height) {
        int mw = 0, lp = 0, rp = height.length-1;
        while(lp<rp){
            int w = rp - lp;
            int ht = Math.min(height[rp], height[lp]);
            int cw = w*ht; // 8*1=8;

            mw = Math.max(mw, cw);
            if(height[lp]<height[rp]){
                lp++;
            }else {
                rp--;
            }
        }
        return mw;
    }
}