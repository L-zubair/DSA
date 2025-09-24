import java.util.*;

public class PascalRow {
    public List<Integer> getRow(int rowIndex) {
        // Initialize row with all 0’s
        List<Integer> row = new ArrayList<>(Collections.nCopies(rowIndex + 1, 0));
        row.set(0, 1); // First element is always 1

        // Build row step by step
        for (int i = 1; i <= rowIndex; i++) {
            // Update from right to left to avoid overwriting values
            for (int j = i; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        return row;
    }

    // Test main method
    public static void main(String[] args) {
        PascalRow pr = new PascalRow();

        System.out.println(pr.getRow(3)); // [1,3,3,1]
        System.out.println(pr.getRow(0)); // [1]
        System.out.println(pr.getRow(1)); // [1,1]
    }
}
