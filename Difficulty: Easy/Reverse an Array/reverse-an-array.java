class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int b[] = new int[arr.length];
        
        int i = arr.length-1, j=0;
        while(j<b.length){
            b[j] = arr[i];
            
            j++;
            i--;
        }
        for(i=0; i<b.length; i++){
            arr[i]=b[i];
        }
    }
}