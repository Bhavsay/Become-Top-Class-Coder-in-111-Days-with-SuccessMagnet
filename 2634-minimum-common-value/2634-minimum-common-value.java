class Solution {
    public int getCommon(int[] num1, int[] num2) {
        HashMap<Integer,Integer> map  = new HashMap<>();
        for(int num : num1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num : num2){
            if(map.containsKey(num) && map.get(num)>0){
                return num;
            }
        }
        return -1;
    }
}