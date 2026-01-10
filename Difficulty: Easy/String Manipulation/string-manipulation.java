
class Solution {
    static int removeConsecutiveSame(String[] arr) {
        // Your code goes here
        Stack<String> stack = new Stack<>();
        int count = 0;
        for(int i=0;  i<arr.length; i++){
            if(!stack.isEmpty() && arr[i].equals(stack.peek()))  {
                stack.pop();
                count--;
            }
            else {
                stack.push(arr[i]);
                count++;
            }
            
        }
        return count;
    }
}