class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int i=nums2.length-1; i>=0; i--){
            int currentNum = nums2[i];
            if(!stack.isEmpty() && stack.peek()>currentNum){
                map.put(currentNum, stack.peek()); // { 2-7,
                stack.push(currentNum); 
            }
            else if(stack.isEmpty()){
                map.put(currentNum,-1);
                stack.push(currentNum);
            }
            else {
                while(!stack.isEmpty() && stack.peek()<currentNum){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    map.put(currentNum,-1);
                    stack.push(currentNum);
                }
                else {
                    map.put(currentNum,stack.peek());
                    stack.push(currentNum);
                }
            }
        }
        int[] ans = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}