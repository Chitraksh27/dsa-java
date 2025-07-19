// Java program to find maximum sum of a subarray using Kadane's Algorithm.

// Asked by Zoho, Flipkart, Morgan Stanley, Accolite, Amazon, Microsoft, Samsung, Snapdeal, 24*7 Innovation Labs, Citrix, D-E-Shaw, FactSet, Hike, Housing.com, MetLife, Ola Cabs, Oracle, Payu, Teradata, Visa, Walmart, Adobe, Google and Arcesium

public class KadaneAlgorithm {
    static int maxSubarraySum(int[] arr) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum < 0)
                sum = 0;

            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 7, 8};

        System.out.println(maxSubarraySum(arr));
    }
}
