class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0; // answer
        int lp = 0, rp = height.length - 1; // left and right pointers

        while (lp < rp) {
            int w = rp - lp; // width
            int ht = Math.min(height[lp], height[rp]); // min height
            int currWater = w * ht; // current area

            maxWater = Math.max(maxWater, currWater); // update max

            // move the smaller pointer
            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }

        return maxWater;
    }
}
