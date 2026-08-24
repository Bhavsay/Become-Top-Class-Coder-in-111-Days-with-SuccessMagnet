class Solution {
    public int lastStoneWeight(int[] stones) {
        
        Queue<Integer> max_Heap = new PriorityQueue<>(Comparator.reverseOrder());

        for(int stone : stones){
            max_Heap.offer(stone);
        }
        while(max_Heap.size() > 1){
            int y = max_Heap.poll();
            int x = max_Heap.poll();

            if(y != x){
                max_Heap.offer(y - x);
            }
        }
        return max_Heap.isEmpty() ? 0 : max_Heap.poll();
    }
}