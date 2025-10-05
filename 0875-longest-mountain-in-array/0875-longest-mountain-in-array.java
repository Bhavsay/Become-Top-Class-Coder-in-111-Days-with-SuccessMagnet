class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        if(n < 3) return 0;

        int[] pref = new int[n]; // increasing sequence lengths
        int[] suff = new int[n]; // decreasing sequence lengths

        // Compute increasing lengths
        for(int i = 1; i < n; i++){
            if(arr[i] > arr[i-1]){
                pref[i] = pref[i-1] + 1;
            }
        }

        // Compute decreasing lengths
        for(int i = n-2; i >= 0; i--){
            if(arr[i] > arr[i+1]){
                suff[i] = suff[i+1] + 1;
            }
        }

        int longest = 0;
        for(int i = 0; i < n; i++){
            if(pref[i] > 0 && suff[i] > 0){ // peak condition
                longest = Math.max(longest, pref[i] + suff[i] + 1);
            }
        }

        return longest;
    }
}
