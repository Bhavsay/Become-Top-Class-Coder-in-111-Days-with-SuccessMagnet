class Solution {  
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;    
    }
}

// class Solution {
//     public boolean isPalindrome(String s) {
//         int left = 0, right = s.length() - 1;
        
//         while (left<right) {
//             while (left<right && !Character.isLetterOrDigit(s.charAt(left))) {
//                 left++;
//             }
//             while (left<right && !Character.isLetterOrDigit(s.charAt(right))) {
//                 right--;
//             }
            
//             if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }
// }