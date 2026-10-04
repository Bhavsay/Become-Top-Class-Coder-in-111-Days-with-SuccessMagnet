class Solution {
    public int minRotations(String s) {

        int res = 0, current = 0;
        
        for(int i=0; i<s.length(); i++){
            
            int reach = s.charAt(i)-'0';
            
            int diff = Math.abs(reach-current);
        
            res += Math.min(diff, 10-diff);

            current = reach;
        }
        return res;
    }
}