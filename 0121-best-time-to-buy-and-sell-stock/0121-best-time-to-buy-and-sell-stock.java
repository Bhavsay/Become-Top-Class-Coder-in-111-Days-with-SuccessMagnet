class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                int profit = price - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;



        //------------------------------------------------------------------------
        // int n = prices.length;
        // int maxProfit = 0;

        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         int profit = prices[j] - prices[i];
        //         if (profit > maxProfit) {
        //             maxProfit = profit;
        //         }
        //     }
        // }
        // return maxProfit;
    }
}