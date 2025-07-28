class Solution {
    public boolean isPalindrome(int n) {
         int original = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;            // Get last digit
            reverse = reverse * 10 + digit; // Build reversed number
            n /= 10;                        // Remove last digit
        }

        return original == reverse; // Check if reversed equals original
        
    }
}