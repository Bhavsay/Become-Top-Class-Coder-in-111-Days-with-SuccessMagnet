class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            int nextElement = -1;
            for(int j=i+1; j<n; j++){
                if(arr[j]>arr[i]){
                    nextElement = arr[j];
                    break;
                }
            }
            list.add(nextElement);
        }
        return list;
        
        
    }
}