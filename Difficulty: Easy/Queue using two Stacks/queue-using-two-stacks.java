// User function Template for Java
class StackQueue {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();
    public void push(int B) {
        input.push(B);
    }
    public int pop() {
        while(!input.isEmpty()){
            output.push(input.pop());
        }
        
        if (output
        .isEmpty()) return -1;
        
        int popped=output.pop();
        
        while(!output.isEmpty()){
            input.push(output.pop());
        }
        return popped;
    }
}