class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        int i = 0;
        while (i < n) {

            while (i < n && sb.charAt(i) == ' ') i++;

            
            StringBuilder word = new StringBuilder();
            while (i < n && sb.charAt(i) != ' ') {
                word.append(sb.charAt(i));
                i++;
            }

            
            if (word.length() > 0) {
                if (ans.length() > 0) ans.append(" ");
                ans.append(word.reverse());
            }
        }

        return ans.toString();
    }
}
/*
// Reverse the whole string
// Skip spaces
// Collect the word
// Reverse the word back and add to answer
*/