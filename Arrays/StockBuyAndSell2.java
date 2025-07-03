// Java program to find the maximum profit from Stock Buy and Sell if only one transaction is allowed

// Asked by Bloomberg, Facebook, Intel, Infosys, Zoho, Morgan Stanley, Amazon, Microsoft, Samsung, Yahoo, PayPal, Nvidia, Oracle, Visa, Walmart, Goldman Sachs, TCS, Adobe, Google, IBM, Accenture, Apple and Uber

public class StockBuyAndSell2 {
    static int maxProfit(int[] prices) {
        int minCost = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for (int i = 1; i < prices.length; i++) {
            minCost = Math.min(minCost, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minCost);
        }

        return maxProfit;

    }
    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};

        System.out.println(maxProfit(prices));
    }
}
