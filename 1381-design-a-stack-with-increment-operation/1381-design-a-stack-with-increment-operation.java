class CustomStack {
    private int[] arr;
    private int top;
    private int maxSize;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new int[maxSize];
        this.top = -1;
    }
    
    public void push(int x) {
        // add only if stack not full
        if (top < maxSize - 1) {
            arr[++top] = x;
        }
    }
    
    public int pop() {
        if (top == -1) {
            return -1;       // stack empty
        }
        return arr[top--];   // return and decrease top
    }
    
    public void increment(int k, int val) {
        // increment bottom k elements
        int limit = Math.min(k, top + 1);  // if stack has less than k elements
        for (int i = 0; i < limit; i++) {
            arr[i] += val;
        }
    }
}


/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */