import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] arr) {

        if(arr.length==0){
            return 0;
        }

        int len = 1;
        int maxlen = 1;
        int n = arr.length;

        Arrays.sort(arr);

        for(int i=0; i<n-1; i++){
            
            if(arr[i]==arr[i+1]){
                continue;
            }
            if(arr[i]==arr[i+1]-1){
                len++;
                maxlen = Math.max(maxlen,len);
            }
            else{
                len=1;
            }
        }
        return maxlen;
    }
}