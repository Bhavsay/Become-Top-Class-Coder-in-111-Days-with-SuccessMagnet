class Solution {
    public int maxDepth(String s) {

        int depth = 0;
        int res = 0;
        for (char c : s.toCharArray()) {
            if (c == ')') {
                depth--;
                continue;
            }
          
            if (c != '(') continue;
            depth++;
         
            if (depth > res) res = depth;
        }
        return res;
    }
}