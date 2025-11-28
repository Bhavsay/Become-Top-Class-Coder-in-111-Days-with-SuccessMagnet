import java.util.*;

class Solution {

    public int aggressiveCows(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr); // stalls must be sorted

        int low = 1;                      // minimum possible distance
        int high = arr[n - 1] - arr[0];   // maximum possible distance
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2; // try this minimum distance

            if (canWePlace(arr, k, mid)) {
                ans = mid;        // mid is possible, try for bigger distance
                low = mid + 1;
            } else {
                high = mid - 1;   // mid is not possible, reduce distance
            }
        }

        return ans;
    }

    // Check if we can place k cows such that minimum distance between them is at least dist
    private boolean canWePlace(int[] arr, int k, int dist) {
        int countCows = 1;        // first cow at first stall
        int lastPos = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - lastPos >= dist) {
                countCows++;
                lastPos = arr[i];

                if (countCows == k) {
                    return true; // successfully placed all cows
                }
            }
        }

        return false; // couldn't place all k cows with at least dist apart
    }
}
