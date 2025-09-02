class Solution {

    public int majorityElement(int[] arr){
        int count = 0, res = 0;
        for(int num: arr){
            if(count==0)
                res = num;
            if(num!=res)
                count--;
            else
                count++;
        }
        return res;
    }
}
/*
class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()>(n/2)) {
                return entry.getKey();
            }
        }
        return -1;
        
    }
}
*/