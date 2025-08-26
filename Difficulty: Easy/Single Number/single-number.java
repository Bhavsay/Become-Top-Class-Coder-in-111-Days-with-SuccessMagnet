// User function Template for Javaans = 0
class Solution {
    int getSingle(int arr[]) {
        int ans = 0;
        for (int num : arr) {
            ans ^= num; // XOR all numbers
        }
        return ans;
    }
}
