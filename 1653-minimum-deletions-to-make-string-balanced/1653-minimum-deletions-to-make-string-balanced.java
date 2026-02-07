class Solution {
    public int minimumDeletions(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()==ch && stack.peek()<ch){
                stack.push(ch);
            }
            else if(!stack.isEmpty() && stack.peek()!=ch && stack.peek()>ch){
                stack.pop();
                count++;
            }
            else {
                stack.push(ch);
            }
        }
        return count;
    }
}