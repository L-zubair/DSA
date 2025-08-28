public class IsPalindrome {
    public boolean isPalindrome(int x) {
        // If number is negative or ends with 0 (but not zero itself), it's not a palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        while (x > reversed) {
            int digit = x % 10;                 // Get last digit
            reversed = reversed * 10 + digit;  // Add digit to reversed half
            x /= 10;                            // Remove last digit from x
        }

        // For odd digits, reversed will have 1 extra digit, so check reversed/10
        return (x == reversed || x == reversed / 10);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] testCases = {121, -121, 10, 0, 12321, 1221, 123};
        for (int num : testCases) {
            System.out.println("Input: " + num + " → " + sol.isPalindrome(num));
        }
    }
}
