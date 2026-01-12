class GetMin {
    
    static Stack<Integer> minStack = new Stack<>();
    // Function to push all the elements into the stack.
    public static Stack<Integer> _push(int arr[]) {
        // your code here
        int min = Integer.MAX_VALUE;
        Stack<Integer> stack = new Stack<>();
        for(int i : arr){
            if(i < min){
                min = i;
            }
            stack.add(i);
            minStack.add(min);
        }
        return stack;
    }

    // Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer> s) {
        // your code here
        while(!s.empty()){
            System.out.print(minStack.pop() + " ");
            s.pop();
        }
    }
}