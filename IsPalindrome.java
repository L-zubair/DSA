class Solution {
    public boolean isPalindrome(int x) {
        // Step 1: Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        // Step 2: Reverse half of the number
        int reversed = 0;
        while (x > reversed) {
            int digit = x % 10;        // Get last digit
            reversed = reversed * 10 + digit; // Add digit to reversed half
            x = x / 10;                // Remove last digit from x
        }

        // Step 3: Check if original half equals reversed half
        // For odd length numbers, reversed/10 removes the middle digit
        return (x == reversed) || (x == reversed / 10);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isPalindrome(121));  // true
        System.out.println(sol.isPalindrome(-121)); // false
        System.out.println(sol.isPalindrome(10));   // false
    }
}
