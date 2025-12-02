import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
         Stack<Character> stack = new Stack<>();
        char[] str = s.toCharArray();

        for(char ch : str){
            // opening brackets
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            else {
                // closing but nothing to match
                if(stack.isEmpty()) return false;

                if(ch == ')' && stack.peek() == '('){
                    stack.pop();
                }
                else if(ch == ']' && stack.peek() == '['){
                    stack.pop();
                }
                else if(ch == '}' && stack.peek() == '{'){
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}