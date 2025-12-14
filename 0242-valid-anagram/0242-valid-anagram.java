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