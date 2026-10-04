class Solution {
    public int minRotations(int n, String s) {

        int[] a = new int[n];

        for(int i=0; i<n; i++){
            a[i] = s.charAt(i)-'0';
        }
        int original = 0;
        int prev = 0;

        for(int x : a){
            int diff = Math.abs(x-prev);
            original += Math.min(diff, 10-diff);
            prev = x;
        }
        int ans = original;

        for(int k=0; k<n; k++){
            int before = (k==0) ? 0 : a[k-1];
            int first = a[k];
            int last = a[n-1];

            int oldCost = Math.min(
                Math.abs(before - first),
                10-Math.abs(before-first)
            );

            int newCost = Math.min(
                Math.abs(before-last),
                10-Math.abs(before-last)
            );

        int candidate = original-oldCost+newCost;
        ans = Math.min(ans, candidate);
        }
        return ans;
    }   
}