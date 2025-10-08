import java.util.HashMap;
import java.util.Map;
class Solution {
    public int minimumLength(String s) {
        if(s.length()<=2){
            return s.length();
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int count = 0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()%2==0){
                count+=2;
            }
            else {
                count+=1;
            }

        }
        return count;
    }
}