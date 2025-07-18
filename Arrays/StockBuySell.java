// Java program to solve the Stock Buy and Sell problem with one transaction allowed

// Asked by Bloomberg, Facebook, Intel, Infosys, Zoho, Morgan Stanley, Amazon, Microsoft, Samsung, Yahoo, PayPal, Nvidia, Oracle, Visa, Walmart, Goldman Sachs, TCS, Adobe, Google, IBM, Accenture, Apple and Uber

public class StockBuySell {
    public static int maximumProfit(int[] prices) {
        int maxProfit = 0;
        int minCost = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            minCost = Math.min(minCost, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minCost);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {1, 3, 6, 9, 11};

        System.out.println(maximumProfit(prices));
    }
}
