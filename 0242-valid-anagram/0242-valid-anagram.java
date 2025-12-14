class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        // anagram which was same letter and count of letter should be same.
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(char sc : s.toCharArray()){
            map1.put(sc,map1.getOrDefault(sc,0)+1);
        }

        for(char tc : t.toCharArray()){
            map2.put(tc,map2.getOrDefault(tc,0)+1);
        }

        return map1.equals(map2);
    }
}
/*
1️⃣ map.put(key, value)
put() adds or updates key value in the map.
HashMap<Character, Integer> map = new HashMap<>();
map.put('a', 1);  map after execution { a = 1 }
🔁 If key already exists
map.put('a', 2);  map becomes { a = 2 } old value is replaced

2️⃣ map.getOrDefault(key, defaultValue)
👉 What it does
If key exists → return its value
If key does NOT exist → return defaultValue
map.getOrDefault(key, defaultValue); syntax

eg
map.getOrDefault('b', 0);

Explanation
'b' not in map
returns 0
✔ No error, safe method


🔹 3️⃣ Why We Use BOTH Together
Correct Counting Pattern
Syntax - map.put(ch, map.getOrDefault(ch, 0) + 1);
s = "anagram"
ch = 'a'
map.getOrDefault('a', 0) → 0
map.put('a', 0 + 1)
{ a = 1 }
{ a = 3, n = 1, g = 1, r = 1, m = 1 }
*/




