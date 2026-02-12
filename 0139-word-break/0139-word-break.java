class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int slen = s.length();
        HashSet<String> set = new HashSet<>(wordDict);

        boolean[] track = new boolean[slen + 1];
        track[0] = true;

        for (int i = 0; i < slen; i++) {

            if (!track[i]) continue;   

            for (int j = i + 1; j <= slen; j++) {

                String curr = s.substring(i, j);

                if (set.contains(curr)) {
                    track[j] = true;
                }
            }
        }
        return track[slen];
    }
}