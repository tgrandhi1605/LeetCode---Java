package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        List<Integer> profits = new ArrayList<>();

        for (int i = 0 ; i < prices.length ; i++) {
            for (int j = i + 1; j < prices.length ; j ++ ) {
                if (prices[i] < prices[j]) {
                    int profit = prices[j] - prices[i];
                    profits.add(profit);
                }
            }
        }
        Collections.sort(profits);
        if (profits.isEmpty()) {
            return 0;
        }

        return profits.get(profits.size() - 1);

    }

    public static void main(String[] args) {
        BuyAndSellStock stock = new BuyAndSellStock();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + stock.maxProfit(prices)); // Output: 5

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Maximum Profit: " + stock.maxProfit(prices2)); // Output: 0
    }
}
