class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[0] - a[0]  
        );

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            pq.add(new int[]{entry.getValue(), entry.getKey()});
        }

        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            result[i] = pq.poll()[1];
        }

        return result;
    }
}