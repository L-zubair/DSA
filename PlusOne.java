public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the last digit and move backwards
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                // If the digit is less than 9, just increment and return
                digits[i]++;
                return digits;
            }
            // If the digit is 9, it becomes 0 (carry over)
            digits[i] = 0;
        }

        // If we reach here, it means all digits were 9
        // Example: [9,9,9] → [1,0,0,0]
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1; // put 1 at start, rest default 0
        return newNumber;
    }

    public static void main(String[] args) {
        PlusOne sol = new PlusOne();
        
        int[] result1 = sol.plusOne(new int[]{1,2,3});
        printArray(result1); // [1,2,4]

        int[] result2 = sol.plusOne(new int[]{4,3,2,1});
        printArray(result2); // [4,3,2,2]

        int[] result3 = sol.plusOne(new int[]{9});
        printArray(result3); // [1,0]

        int[] result4 = sol.plusOne(new int[]{9,9,9});
        printArray(result4); // [1,0,0,0]
    }

    // Helper method to print arrays nicely
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(",");
        }
        System.out.println("]");
    }
}
