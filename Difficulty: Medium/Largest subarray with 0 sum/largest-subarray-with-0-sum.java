class Solution {
    int maxLength(int arr[]) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        int pref[] = new int[n];
        
        int maxlen=0;
        
        pref[0]=arr[0];
        
        map.put(pref[0],0);
        
        if(pref[0]==0){
            maxlen=1;
        }
        
        for(int i=1; i<n; i++){
            pref[i]=pref[i-1]+arr[i];
            
            if(pref[i]==0){
                maxlen = i+1;
            }
            if(map.containsKey(pref[i])){
                maxlen = Math.max(maxlen,i-map.get(pref[i]));
            }
            else{
                map.put(pref[i],i);
            }
        }
        return maxlen;
        
    }
}