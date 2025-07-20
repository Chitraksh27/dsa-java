// Java program to find the maximum possible sum of a non-empty subarray in a circular array.

// Asked by Amazon and Microsoft

public class MaxCircularSum {
    public static int circularSubarraySum(int[] arr) {
        int totalSum = 0;
        int currMaxSum = 0, currMinSum = 0;
        int maxSum = arr[0], minSum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];

            currMinSum = Math.min(currMinSum + arr[i], arr[i]);
            currMaxSum = Math.max(currMaxSum + arr[i], arr[i]);

            maxSum = Math.max(currMaxSum, maxSum);
            minSum = Math.min(currMinSum, minSum);
        }

        int normalSum = maxSum;
        int circular = totalSum - minSum;

        if (circular == 0)
            return normalSum;

        return Math.max(circular, normalSum);
    }
    public static void main(String[] args) {
        int[] arr = {10, -3, -4, 7, 6, 5, -4, -1};

        System.out.println(circularSubarraySum(arr));
    }
}
