class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int totalCandies = n;
        int i = 1;

        while (i < n) {
            if (ratings[i] == ratings[i - 1]) {
                i++;
                continue;
            }

            int currentPeak = 0;
            while (i < n && ratings[i] > ratings[i - 1]) {
                currentPeak++;
                totalCandies += currentPeak;
                i++;
            }

            if (i == n) {
                return totalCandies;
            }

            int currentValley = 0;
            while (i < n && ratings[i] < ratings[i - 1]) {
                currentValley++;
                totalCandies += currentValley;
                i++;
            }

            totalCandies -= Math.min(currentPeak, currentValley);
        }

        return totalCandies;        
    }
}
/*class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        if(n==1) return 1;

        for(int i=1; i<n; i++){
            if(ratings[i]>ratings[i-1] && candies[i]<=candies[i-1]){
                candies[i]=candies[i-1]+1;
            }
        }

        for(int i=n-2; i>=1; i--){
            if(rantings[i]>ratings[i+1] && candies[i]<=candies[i+1]){
                candies[i]=candies[i-1]+1;
            }
        }
        
        int totalcandies = 0;
        for(int i=0; i<n; i++){
            totalcandies+=candies[i];
        }
        return totalcandies;
    }
}
*/