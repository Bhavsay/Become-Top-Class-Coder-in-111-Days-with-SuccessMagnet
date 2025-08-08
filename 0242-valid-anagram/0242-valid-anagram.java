import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false; // quick length check

        Map<Character, Integer> ma = new HashMap<>();
        Map<Character, Integer> mb = new HashMap<>();

        for (char ch : s.toCharArray()) {
            ma.put(ch, ma.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            mb.put(ch, mb.getOrDefault(ch, 0) + 1);
        }

        return ma.equals(mb);
    }
}


// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if (s.length() != t.length()) {
//             return false;
//         }

//         Map<Character, Integer> counter = new HashMap<>();

//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             counter.put(ch, counter.getOrDefault(ch, 0) + 1);
//         }

//         for (int i = 0; i < t.length(); i++) {
//             char ch = t.charAt(i);
//             if (!counter.containsKey(ch) || counter.get(ch) == 0) {
//                 return false;
//             }
//             counter.put(ch, counter.get(ch) - 1);
//         }

//         return true;        
//     }
// }