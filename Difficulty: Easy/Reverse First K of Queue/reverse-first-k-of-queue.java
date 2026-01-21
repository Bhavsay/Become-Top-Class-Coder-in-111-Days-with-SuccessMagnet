class GfG {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // code here.
        // code here
        if(q.size() < k) {
            return q;
        }
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<k; i++){
            stack.push(q.poll());
        }
        Queue<Integer> ans = new LinkedList<>();
        while(!stack.isEmpty()){
            ans.offer(stack.pop());
        }
        while(!q.isEmpty()){
                ans.offer(q.poll());
            }
        return ans;
        
    }
}