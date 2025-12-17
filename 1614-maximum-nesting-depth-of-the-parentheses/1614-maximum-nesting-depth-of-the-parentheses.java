class Solution {
    public int maxDepth(String s) {
        int res = 0;
        int current = 0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                current++;
                res = Math.max(res,current);
            }
            else if(ch==')'){
                current--;
            }
        }
        return res;
    }
}