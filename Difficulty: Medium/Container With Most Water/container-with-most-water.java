class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int mw = 0, lp = 0, rp = arr.length-1;
        while(lp<rp){
            int w = rp - lp;
            int ht = Math.min(arr[rp], arr[lp]);
            int cw = w*ht; // 8*1=8;

            mw = Math.max(mw, cw);
            if(arr[lp]<arr[rp]){
                lp++;
            } else {
                rp--;
            }
        }
        return mw;
        
    }
}