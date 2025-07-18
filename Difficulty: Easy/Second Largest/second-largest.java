class Solution {
    public int getSecondLargest(int[] arr) {
        
        int max=Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int secondMax =Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>secondMax && arr[i]<max){
                secondMax=arr[i];
            }
        }
        if(secondMax==Integer.MIN_VALUE){
            return -1;
        }
        return secondMax;
    }
}
