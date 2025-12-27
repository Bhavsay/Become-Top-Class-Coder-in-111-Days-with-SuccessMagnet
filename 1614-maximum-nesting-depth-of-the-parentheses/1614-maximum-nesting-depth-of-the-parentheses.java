class Solution {
    public int maxDepth(String s) {
        int count=0;
        int res = 0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                count++;
                res = Math.max(count,res);
            }
            else if(ch==')'){
                count--;
            }
        }
        return res;
    }
}