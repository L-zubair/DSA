public class climbStairs {
    public int climbStairs(int n) {
        // Base case: if n is 1 or 2, directly return n
        if (n <= 2) {
            return n;
        }

        // Initialize base values
        int prev2 = 1;  // ways(1)
        int prev1 = 2;  // ways(2)

        // Iterate from 3 up to n
        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2; // ways(i) = ways(i-1) + ways(i-2)
            prev2 = prev1;            // shift window
            prev1 = curr;
        }

        return prev1; // ways(n)
    }

    // Optional: testing the function
    public static void main(String[] args) {
        climbStairs cs = new climbStairs();
        System.out.println(cs.climbStairs(2)); // Output: 2
        System.out.println(cs.climbStairs(3)); // Output: 3
        System.out.println(cs.climbStairs(5)); // Output: 8
    }
}
