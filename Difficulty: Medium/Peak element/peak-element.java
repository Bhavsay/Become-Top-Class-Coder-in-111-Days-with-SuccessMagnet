import java.util.*;
class Solution {
    public int peakElement(int[] arr) {
        
        int n = arr.length;
        
        for (int i=0; i<n; i++) {
            boolean leftCheck = (i == 0 || arr[i] > arr[i - 1]);
            boolean rightCheck = (i == n - 1 || arr[i] > arr[i + 1]);

            if (leftCheck && rightCheck) {
                return i;  // Return index of any one peak
            }
        }
        return -1;
    }
}