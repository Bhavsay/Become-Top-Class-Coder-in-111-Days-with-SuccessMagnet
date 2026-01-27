class Solution {
    public int vowelConsonantScore(String s) {
        int count = 0;
        int consonate = 0;
        
        for(char ch : s.toCharArray()){
            if(ch >= 'a' && ch <='z'){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    count++;
                } else {
                    consonate++;
                }
            }
        }
        return consonate==0 ? 0 : count/consonate;
    }
}