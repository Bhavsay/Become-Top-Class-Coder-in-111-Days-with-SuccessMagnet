class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int maxBananas = 0;
        for(int pile : piles){
            maxBananas = Math.max(maxBananas, pile);
        }

        int low = 1;
        int high = maxBananas;
        int answer = high;
         
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(canEatAllBananas(piles,h,mid)){
                answer = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return answer;
    }

    private boolean canEatAllBananas(int[] piles, int h, int k){
        long totalHours = 0;

        for(int pile : piles){
            totalHours += (pile + k - 1) / k;
            if(totalHours>h){
                return false;
            }
        }
        return totalHours <= h;
    }
}