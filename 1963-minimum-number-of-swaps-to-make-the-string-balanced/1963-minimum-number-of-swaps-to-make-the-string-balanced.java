class Solution {
    public int minSwaps(String s) {
        int unmatchOB = 0;
        for(char ch : s.toCharArray()){
            if(ch=='['){
                unmatchOB++;
            }
            else if(unmatchOB>0) {
                unmatchOB--;
            }
        }
        return (unmatchOB+1)/2;
    }
}
