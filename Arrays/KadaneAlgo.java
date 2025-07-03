// Java program to find the maximum sum of a subarray

// Asked by Zoho, Flipkart, Morgan Stanley, Accolite, Amazon, Microsoft, Samsung, Snapdeal, 24*7 Innovation Labs, Citrix, D-E-Shaw, FactSet, Hike, Housing.com, MetLife, Ola Cabs, Oracle, Payu, Teradata, Visa, Walmart, Adobe, Google and Arcesium

public class KadaneAlgo {
    static int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            maxSum = Math.max(maxSum, sum);

            if (sum < 0)
                sum = 0;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};

        System.out.println(maxSubarraySum(arr));
    }    
}
