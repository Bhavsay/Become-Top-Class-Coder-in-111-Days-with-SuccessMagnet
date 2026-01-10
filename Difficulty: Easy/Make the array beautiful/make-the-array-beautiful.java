class Solution {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        // code here
        Stack<Integer> stack = new Stack<>();
        for(int i=0;  i<arr.length; i++){
            if(arr[i]>=0 && !stack.isEmpty() && stack.peek()<0) {
                stack.pop();
            }
            else if(arr[i]<0 && !stack.isEmpty() && stack.peek()>=0){
                stack.pop();
            }
            else {
                stack.push(arr[i]);
            }
            
        }
        ArrayList<Integer> list = new ArrayList<>(stack);
        return list;
    }
}
