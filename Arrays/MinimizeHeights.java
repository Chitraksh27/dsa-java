// Java program to find the minimum possible difference between the heights of the shortest and tallest towers after performing at most k operations.

// Asked by Microsoft and Adobe

import java.util.*;

public class MinimizeHeights {
    static int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int result = arr[n - 1] - arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < k)
                continue;

            int minHeight = Math.min(arr[0] + k, arr[i] - k);
            int maxHeight = Math.max(arr[i - 1] + k, arr[n - 1] - k);

            result = Math.min(result, maxHeight - minHeight);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 9, 12, 16, 20 };
        int k = 3;

        System.out.println(getMinDiff(arr, k));
    }
}
