class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i = 0;
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c : s.toCharArray()){
            if(map.get(c)==1){
                return i;
            }
            i++;
        }
        return -1;
    }
}