class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] mapST = new char[128]; // mapping from s to t
        char[] mapTS = new char[128]; // mapping from t to s

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (mapST[c1] == 0 && mapTS[c2] == 0) {
                // create mapping
                mapST[c1] = c2;
                mapTS[c2] = c1;
            } else {
                // check existing mapping
                if (mapST[c1] != c2 || mapTS[c2] != c1) {
                    return false;
                }
            }
        }
        return true;
    }
}
