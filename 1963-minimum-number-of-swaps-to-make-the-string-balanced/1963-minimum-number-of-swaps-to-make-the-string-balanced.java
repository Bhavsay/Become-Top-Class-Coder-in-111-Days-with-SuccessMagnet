class Solution {
    public int minSwaps(String s) {
        int unmatchedOpenBrackets = 0;
        for(char c : s.toCharArray()){
            if(c=='['){
                unmatchedOpenBrackets++;
            }
            else if (unmatchedOpenBrackets>0){
                unmatchedOpenBrackets--;
            }
        }
        return (unmatchedOpenBrackets+1)/2;
    }
}