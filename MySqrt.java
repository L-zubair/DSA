public class MySqrt {
    public int mySqrt(int x) {
        // Base cases
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 1, right = x, ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // To prevent overflow, use long for multiplication
            long square = (long) mid * mid;

            if (square == x) {
                return mid; // exact square root found
            } else if (square < x) {
                ans = mid;  // store best so far
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    // Test main
    public static void main(String[] args) {
        MySqrt sol = new MySqrt();
        System.out.println(sol.mySqrt(4));  // Output: 2
        System.out.println(sol.mySqrt(8));  // Output: 2
        System.out.println(sol.mySqrt(25)); // Output: 5
        System.out.println(sol.mySqrt(0));  // Output: 0
    }
}
