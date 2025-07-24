class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here

        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == k) {
                result = mid;       // Save the index
                end = mid - 1;      // Keep searching to the left
            } else if (arr[mid] > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }
}