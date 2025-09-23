import java.util.*;

public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // First row is always [1]
        if (numRows >= 1) {
            triangle.add(new ArrayList<>());
            triangle.get(0).add(1);
        }

        // Build remaining rows
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();

            row.add(1); // first element is 1

            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            row.add(1); // last element is 1

            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + generate(5));
        System.out.println("Example 2: " + generate(1));
    }
}
