class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();
       
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
            queue.offer(c);
            while(!queue.isEmpty() && map.get(queue.peek())>1){
                queue.poll();
            }
            
        }
        if(queue.isEmpty()){
            return '$';
        }
        else {
            return queue.peek();
        }
    }
}
