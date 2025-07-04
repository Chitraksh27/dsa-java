// Java program to find the maximum circular subarray sum

// Asked by Amazon and Microsoft

public class maxCircularSubarraySum {
    public static int circularSubarraySum (int arr[]) {
        int currMaxSum = arr[0];
        int maxSum = Integer.MIN_VALUE;
        int currentMinSum = arr[0];
        int minSum = Integer.MAX_VALUE;
        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currMaxSum = Math.max(currMaxSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, currMaxSum);
            currentMinSum = Math.min(currentMinSum + arr[i], arr[i]);
            minSum = Math.min(minSum, currentMinSum);

            totalSum += arr[i];
        }

        int normalSum = maxSum;
        int circularSum = totalSum - minSum;

        if (normalSum == totalSum) {
            return normalSum;
        }
        return Math.max(normalSum, circularSum);
    }
    public static void main(String[] args) {
        int[] arr = {8, -8, 9, -9, 10, -11, 12};

        System.out.println(circularSubarraySum(arr));
    }
}
