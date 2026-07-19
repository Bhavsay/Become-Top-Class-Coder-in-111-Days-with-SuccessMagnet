class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int price : prices){
            if(price<minPrice){
                minPrice = price;
            }
            else {
                int profit = price - minPrice;
                if(profit>maxprofit){
                    maxprofit = profit;
                }
            }
        }
        return maxprofit;
        
        //  // [7, 1, 5, 3, 6, 4];
        // int minPrice = Integer.MAX_VALUE; //2147483647 , 1 
        // int maxProfit = 0; //  4 , 5

        // for(int price : prices){
        //     if(price<minPrice){ // 7<214, 1<7, 5<1F, 3<1F, 6<1F, 4<1F
        //         minPrice = price; 
        //     }else {
        //         int profit = price - minPrice;  //  5-1=4, 3-1=2, 6-1=5, 4-1=3,
        //         if(profit>maxProfit){ // 5>4 , 3>5F
        //             maxProfit = profit; // 5
        //         }
        //     } 
        // }
        // return maxProfit;
    }
}