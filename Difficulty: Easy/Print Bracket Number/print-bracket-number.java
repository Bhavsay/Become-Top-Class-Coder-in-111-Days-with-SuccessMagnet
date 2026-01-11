// User function Template for Java

class Solution {
    ArrayList<Integer> bracketNumbers(String str) {
        // code here
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for(char ch : str.toCharArray()){
            if(ch == '('){
                count++;
                stack.push(count);
                list.add(count);
            }
            else if (ch==')'){
                list.add(stack.pop());
            }
        }
        return list;
          
    }
};