class Solution {
    public int reverseDegree(String s) {
        int pro = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            int ridx = 26 - (ch - 'a');

            int stringind = i + 1;

            pro += ridx * stringind;
        }
        return pro;
    }
}