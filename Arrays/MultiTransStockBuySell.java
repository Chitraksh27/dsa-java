// Java program to solve the Stock Buy and Sell problem with multiple transactions allowed

// Asked by Paytm, Flipkart, Morgan Stanley, Accolite, Amazon, Microsoft, Samsung, D-E-Shaw, Hike, MakeMyTrip, Ola Cabs, Oracle, Walmart, Goldman Sachs, Directi, Intuit, SAP Labs, Quikr, Facebook, Salesforce, Pubmatic, Sapient and Swiggy

public class MultiTransStockBuySell {
    public static int maximumProfit(int prices[]) {
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = { 100, 180, 260, 310, 40, 535, 695 };

        System.out.println("Maximum profit from stock transactions: " + maximumProfit(prices));
    }
}
