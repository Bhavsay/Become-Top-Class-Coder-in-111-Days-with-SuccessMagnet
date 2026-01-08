import java.util.*;

class Solution {
    public ArrayList<Integer> nextGreater(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int idx = i % n;

            while (!stack.isEmpty() && stack.peek() <= nums[idx]) {
                stack.pop();
            }

            if (i < n) {
                res[idx] = stack.isEmpty() ? -1 : stack.peek();
            }

            stack.push(nums[idx]);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int x : res) ans.add(x);

        return ans;
    }
}
