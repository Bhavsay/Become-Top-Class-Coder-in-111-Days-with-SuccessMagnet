class Solution {
    public boolean[] transformStr(String s, String[] strs) {
        int n = s.length();

        int[] prefixOnes = new int[n + 1];
        int[] suffZeros = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefixOnes[i + 1] = prefixOnes[i] + (s.charAt(i) == '1' ? 1 : 0);
        }

        for (int i = n - 1; i >= 0; i--) {
            suffZeros[i] = suffZeros[i + 1] + (s.charAt(i) == '0' ? 1 : 0);
        }

        int totalOnes = prefixOnes[n];
        boolean[] ans = new boolean[strs.length];

        for (int k = 0; k < strs.length; k++) {
            String t = strs[k];

            int fixedOnes = 0;
            int questions = 0;
            int fixedPrefixOnes = 0;
            boolean ok = true;

            for (int i = 0; i < n; i++) {
                if (t.charAt(i) == '1') {
                    fixedOnes++;
                    fixedPrefixOnes++;
                } else if (t.charAt(i) == '?') {
                    questions++;
                }

                if (fixedPrefixOnes > prefixOnes[i + 1]) {
                    ok = false;
                    break;
                }
            }

            if (!ok) {
                ans[k] = false;
                continue;
            }

            if (totalOnes < fixedOnes || totalOnes > fixedOnes + questions) {
                ans[k] = false;
                continue;
            }

            int suffFixedZeros = 0;

            for (int i = n - 1; i >= 0; i--) {
                if (t.charAt(i) == '0') {
                    suffFixedZeros++;
                }

                if (suffFixedZeros > suffZeros[i]) {
                    ok = false;
                    break;
                }
            }

            ans[k] = ok;
        }

        return ans;
    }
}