
import java.util.Arrays;

// Java program to find minimum possible difference between the height of the shortest and tallest tower after modification

// Asked by Microsoft and Adobe

public class MinimizeHeightsII {
    static int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);

        int res = arr[n - 1] - arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] - k < 0)
                continue;

            int minHeight = Math.min(arr[0] + k, arr[i] - k);
            int maxHeight = Math.max(arr[i - 1] + k, arr[n - 1] - k);

            res = Math.min(res, maxHeight - minHeight);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 10};
        int k = 2;

        System.out.println(getMinDiff(arr, k));
    }
}
