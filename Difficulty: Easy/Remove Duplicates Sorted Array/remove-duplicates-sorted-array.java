class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        
        if (arr.length == 0) return result;

        int j = 0;
        result.add(arr[0]); // first element always included

        for (int i = 1; i < arr.length; i++) {
            if (arr[j] != arr[i]) {
                result.add(arr[i]);
                j = i;
            }
        }

        return result;
    }
}




