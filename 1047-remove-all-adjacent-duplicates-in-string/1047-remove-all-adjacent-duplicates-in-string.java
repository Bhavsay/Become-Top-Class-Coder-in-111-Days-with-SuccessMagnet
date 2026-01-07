class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()==ch){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        // The iterator for Stack traverses from bottom to top, preserving the insertion order.
        for (Character ch : stack) {
            sb.append(ch);
        }
        String result = sb.toString();
        return result;
    }
}