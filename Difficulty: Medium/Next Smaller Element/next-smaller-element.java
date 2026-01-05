class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        // initialize all element consider as -1 in array
        for(int i=0; i<arr.length; i++) result.add(-1);
        
        Stack<Integer> stack = new Stack<>();
        
        // traverse the array from right to left 
        for(int i=arr.length-1; i>=0; i--){
            
            
            while(!stack.isEmpty() && stack.peek()>=arr[i]){
                stack.pop();
            }
            
            if(!stack.isEmpty()){
                result.set(i,stack.peek());
            }
            
            stack.push(arr[i]);
            
            
        }
        return result;
        
    }
}