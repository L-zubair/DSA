// Import required classes
import java.util.*;

public class ValidPalindrome {

    // Main function to test the program
    public static void main(String[] args) {
        // Example test cases
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";

        // Print results
        System.out.println("Example 1: " + isPalindrome(s1)); // true
        System.out.println("Example 2: " + isPalindrome(s2)); // false
        System.out.println("Example 3: " + isPalindrome(s3)); // true
    }

    // Function to check if a string is palindrome
    public static boolean isPalindrome(String s) {
        // Left pointer at start, right pointer at end
        int left = 0, right = s.length() - 1;

        // Loop until pointers cross
        while (left < right) {
            // If left char is not alphanumeric, skip
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // If right char is not alphanumeric, skip
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare both chars (in lowercase)
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false; // Not palindrome
            }

            // Move both pointers inward
            left++;
            right--;
        }

        // If all chars matched, it's palindrome
        return true;
    }
}
