class Solution {
    public boolean canSplit(int arr[]) {
        int totalSum = 0;

        // Calculate total sum of array
        for (int element : arr) {
            totalSum += element;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == totalSum - sum) {
                return true;
            }
        }
        
        return false;
    }
}




