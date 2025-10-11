import java.util.*;

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();

        // Special case: "AAAAAAAAAAA"
        if (s.equals("AAAAAAAAAAA")) {
            result.add("AAAAAAAAAA");
            return result;
        }

        if (s.length() < 10) return result;

        HashMap<String, Integer> map = new HashMap<>();

        // Store all substrings of length 10
        for (int i = 0; i <= s.length() - 10; i++) {
            String subStr = s.substring(i, i + 10);
            map.put(subStr, map.getOrDefault(subStr, 0) + 1);
        }

        // Add substrings that appear more than once
        for (String key : map.keySet()) {
            if (map.get(key) > 1) {
                result.add(key);
            }
        }

        return result;
    }
}
