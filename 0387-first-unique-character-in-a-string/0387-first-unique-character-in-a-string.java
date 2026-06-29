class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0;
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(char c : s.toCharArray() ){
            if(map.get(c)==1){
                return i;
            }
            i++;
        }
        return -1;

        
    }
}