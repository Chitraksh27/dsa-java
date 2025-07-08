// Java program to merge overlapping intervals

// Asked by Amazon, Microsoft, Google, Nutanix and Zoho

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverlappingIntervals {
    public static List<int[]> mergeOverlap(int[][] arr) {
        List<int[]> result = new ArrayList<>();
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        result.add(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            int[] currInterval = arr[i];
            int[] lastInterval = result.get(result.size() - 1);

            if (currInterval[0] <= lastInterval[1]) {
                lastInterval[1] = Math.max(currInterval[1], lastInterval[1]);
            }
            else {
                result.add(currInterval);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 4}, {6, 8}, {9, 10}};

        List<int[]> mergedIntervals = mergeOverlap(arr);

        for (int[] interval : mergedIntervals) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}
