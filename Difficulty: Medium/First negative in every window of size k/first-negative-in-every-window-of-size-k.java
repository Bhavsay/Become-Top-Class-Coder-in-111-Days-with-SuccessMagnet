class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0) {
                queue.add(arr[i]);
            }
            if(i-start+1==k){
                if(queue.isEmpty()) {
                    list.add(0);
                }
                else {
                    list.add(queue.peek());
                }
                if(!queue.isEmpt
                
                
                y() && arr[start]==queue.peek()){
                    queue.remove();
                }
                start++;
                
            }
        }
        return list;
    }
}