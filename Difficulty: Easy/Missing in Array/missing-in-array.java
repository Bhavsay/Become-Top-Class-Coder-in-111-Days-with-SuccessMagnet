class Solution {
    int missingNum(int arr[]) {
        int n = arr.length + 1; // since one number is missing
        int xorAll = 0;
        int xorArr = 0;
        
        // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xorAll ^= i;
        }
        
        // XOR all elements in the array
        for (int i = 0; i < arr.length; i++) {
            xorArr ^= arr[i];
        }
        
        // XOR of xorAll and xorArr gives the missing number
        return xorAll ^ xorArr;
    }
}