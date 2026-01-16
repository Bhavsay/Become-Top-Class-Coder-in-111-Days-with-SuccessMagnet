class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        Stack<Integer> stack = new Stack<>();
        for(int i=n-1; i>=0; i--){
            int curr = prices[i];
            while(!stack.isEmpty()){
                if(curr>=stack.peek()){
                    prices[i] -= stack.peek();
                    break;
                }
                else {
                    stack.pop();
                }
            }
            stack.push(curr);
        }
        return prices;
    }
}