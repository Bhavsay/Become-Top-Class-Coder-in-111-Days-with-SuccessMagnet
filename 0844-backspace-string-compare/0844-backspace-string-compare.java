class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch!='#'){
                stack1.push(ch);
            }
            else {
                if(stack1.isEmpty()){
                    continue;
                }
                stack1.pop();
            }
        }
        Stack<Character> stack2 = new Stack<>();
        for(char ch: t.toCharArray()){
            if(ch!='#'){
                stack2.push(ch);
            }
            else {
                if(stack2.isEmpty()){
                    continue;
                }
                stack2.pop();
            }
        }
        if(stack1.equals(stack2)){
            return true;
        }
        else {
            return false;
        }
    }
}