class Solution {
    public int lengthOfLongestSubstring(String S) {
        HashSet<Character> charSet = new HashSet<>();
        int left = 0;
        int maxlen = 0;

        for(int right = 0; right < S.length(); right++){
            while(charSet.contains(S.charAt(right))){
                charSet.remove(S.charAt(left));
                left++;                        
            }
            charSet.add(S.charAt(right));
            maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;
    }
}