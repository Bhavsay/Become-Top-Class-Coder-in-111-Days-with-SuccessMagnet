class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        String t = new StringBuilder(s).reverse().toString();
        if(s.equals(t)){
            return true;
        }
        else {
            return false;
        }
    }
}