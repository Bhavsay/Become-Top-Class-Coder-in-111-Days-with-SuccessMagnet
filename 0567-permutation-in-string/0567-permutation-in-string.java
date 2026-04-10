class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        int windowSize = s1.length();

        for (int i = 0; i < s2.length(); i++) {

            char ch = s2.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);

            if (i >= windowSize) {
                char leftChar = s2.charAt(i - windowSize);

                if (map2.get(leftChar) == 1) {
                    map2.remove(leftChar);
                } else {
                    map2.put(leftChar, map2.get(leftChar) - 1);
                }
            }

            
            if (map1.equals(map2)) {
                return true;
            }
        }

        return false;

    }
}