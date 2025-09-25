// Import required classes
import java.util.*;

public class BestTimeToBuySellStock {

    // Main method to test our solution locally
    public static void main(String[] args) {
        // Example test cases
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};

        // Call the function and print results
        System.out.println("Max Profit (Example 1): " + maxProfit(prices1)); // Expected 5
        System.out.println("Max Profit (Example 2): " + maxProfit(prices2)); // Expected 0
    }

    // Function to calculate max profit
    public static int maxProfit(int[] prices) {
        // Step 1: Initialize variables
        int minPrice = Integer.MAX_VALUE; // track minimum stock price seen so far
        int maxProfit = 0; // track maximum profit

        // Step 2: Traverse the array
        for (int price : prices) {
            // If current price is lower than minPrice, update minPrice
            if (price < minPrice) {
                minPrice = price;
            } else {
                // Otherwise, calculate profit if we sell today
                int profit = price - minPrice;
                // Update maxProfit if we found a better profit
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        // Step 3: Return the maximum profit
        return maxProfit;
    }
}
