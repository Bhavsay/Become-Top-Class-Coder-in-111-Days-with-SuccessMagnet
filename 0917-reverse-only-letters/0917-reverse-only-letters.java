class Solution {
    public String reverseOnlyLetters(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                sb.append(stack.pop());
            }
            else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}