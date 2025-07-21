// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    
    static void rotateArr(int arr[], int d){
        int n = arr.length;
        d=d%n;
        
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }
    static void reverse(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

   // ----------------------------------------------------------------------------
    // static void rotateArr(int arr[], int d) {
    //     int n = arr.length;
    //     for(int k=1; k<= d; k++) {
    //         int i=0;
    //         int j=1;
    //         int temp = arr[0];    
    //         while (j<n) {
    //             arr[i] = arr[j];
    //             i++;
    //             j++;
    //         }
    //         arr[n - 1] = temp;
    //     }
        // ----------------------------------------------------------------------------
        // int n = arr.length;
        // d = d % n; // Handle cases where d > n

        // // Create a temporary array to store the rotated version
        // int[] temp = new int[n];

        // // Copy elements from index d to n-1
        // for (int i = 0; i < n - d; i++) {
        //     temp[i] = arr[i + d];
        // }

        // // Copy first d elements to the end
        // for (int i = 0; i < d; i++) {
        //     temp[n - d + i] = arr[i];
        // }

        // // Copy back to the original array
        // for (int i = 0; i < n; i++) {
        //     arr[i] = temp[i];
        // }