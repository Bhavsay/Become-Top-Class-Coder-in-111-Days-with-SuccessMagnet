class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(map.containsKey(sc)){
                if(map.get(sc)!=tc){
                    return false;
                }
        
            }
            else if(map.containsValue(tc)){
                return false;
            }
            map.put(sc,tc);
            
        }
        return true;
       
    }
}
/*
4️⃣ charMap.containsKey(sc)
Checks whether this character from s is already mapped.Map = { e → a }
sc = 'g'
charMap.containsKey('g') → false
Means:
👉 'g' has no mapping yet

Another example
Map = { e → a, g → d }
sc = 'g'
charMap.containsKey('g') → true
Means:
👉 'g' is already mapped

5️⃣ charMap.get(sc)
Returns the mapped value for key sc.
Map = { e → a, g → d }
charMap.get('g') → 'd'
if (charMap.get(sc) != tc)

6️⃣ charMap.containsValue(tc)
Checks whether this target character is already used by another key
Why needed?
To ensure one-to-one mapping.
s = "ab"
t = "aa"
charMap.containsValue('a') → true

7️⃣ charMap.put(sc, tc)
👉 What it does
Stores or updates a mapping.
Example
charMap.put('e', 'a');
Map becomes:
{ e → a }
*/