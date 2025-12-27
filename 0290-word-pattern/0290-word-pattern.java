class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] str = s.split(" ");

        // length check
        if (pattern.length() != str.length) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = str[i];

            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(word)) {
                    return false;
                }
            } else {
                if (map.containsValue(word)) {
                    return false;
                }
                map.put(ch, word);
            }
        }
        return true;
    }
}

/*
"dog cat cat dog" → ["dog","cat","cat","dog"]
pattern = "aaa"
words   = "aa aa aa aa"
map.containsKey('a')  // true
map.get('a') = "dog"
str = "fish"
if (!"dog".equals("fish")) {
    return false;
}
*/

