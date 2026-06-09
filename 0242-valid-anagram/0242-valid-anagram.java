class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> counter = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char sh = s.charAt(i);
            counter.put(sh, counter.getOrDefault(sh, 0)+1);
        }
        for(int i=0; i<t.length(); i++){
            char th = t.charAt(i);
            if(!counter.containsKey(th) || counter.get(th)==0){
                return false;
            }
            counter.put(th, counter.get(th)-1);
        }
        return true;
    }
}