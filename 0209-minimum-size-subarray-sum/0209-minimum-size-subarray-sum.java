class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];
            while (sum >= target) {
                minLen = Math.min(minLen, end - start + 1);
                sum -= nums[start];
                start++;
            }
        }

       if (minLen == Integer.MAX_VALUE) {
         return 0;
        } else {
            return minLen;
    }

    }
}
// class Solution {
//     public int minSubArrayLen(int target, int[] nums) {
//         int minLen = Integer.MAX_VALUE;
//         int left = 0;
//         int curSum = 0;

//         for (int right = 0; right < nums.length; right++) {
//             curSum += nums[right];

//             while (curSum >= target) {
//                 if (right - left + 1 < minLen) {
//                     minLen = right - left + 1;
//                 }
//                 curSum -= nums[left];
//                 left++;
//             }
//         }
        
//         return minLen != Integer.MAX_VALUE ? minLen : 0;        
//     }
// }