class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        int i = 0;
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
            queue.offer(i);
            while(!queue.isEmpty() && map.get(s.charAt(queue.peek()))>1){
                queue.poll();
            }
            i++;
        }
        if(queue.isEmpty()){
            return -1;
        }
        else {
            return queue.peek();
        }

        
    }
}