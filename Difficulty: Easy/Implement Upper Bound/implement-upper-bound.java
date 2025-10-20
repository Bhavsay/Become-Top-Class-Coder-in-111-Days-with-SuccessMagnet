class Solution {
    int upperBound(int[] arr, int target) {
        int idx = arr.length;
        int start = 0; 
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2 ;
            if(arr[mid]>target){
                idx = mid;
                end = mid -1;
            }
            else if(arr[mid]<=target){
                start = mid + 1;
            }
        }
        return idx;
        
        
    }
}
