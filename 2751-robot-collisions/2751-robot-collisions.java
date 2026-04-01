class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;

   
        Integer[] order = new Integer[n];
        for (int i = 0; i < n; i++) {
            order[i] = i;
        }

    
        Arrays.sort(order, (a, b) -> Integer.compare(positions[a], positions[b]));

        Stack<Integer> stack = new Stack<>();

       
        for (int idx : order) {

         
            if (directions.charAt(idx) == 'R') {
                stack.push(idx);
            } 
            else {
                
                while (!stack.isEmpty() && healths[idx] > 0) {
                    int j = stack.peek();   

                    
                    if (healths[j] < healths[idx]) {
                        stack.pop();
                        healths[idx]--;
                        healths[j] = 0;
                    }
                    else if (healths[j] > healths[idx]) {
                        healths[j]--;
                        healths[idx] = 0;
                    }
                    else {
                        stack.pop();
                        healths[j] = 0;
                        healths[idx] = 0;
                    }
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int h : healths) {
            if (h > 0) {
                result.add(h);
            }
        }

        return result;
    }
}