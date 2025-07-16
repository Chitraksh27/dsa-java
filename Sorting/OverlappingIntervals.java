// Java program to merge all overlapping intervals in a given list of intervals

// Asked by Amazon, Microsoft, Google, Nutanix and Zoho

import java.util.ArrayList;
import java.util.Arrays;

public class OverlappingIntervals {
    public static ArrayList<int[]> mergeOverlap(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> res = new ArrayList<>();

        res.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int[] lastInterval = res.get(res.size() - 1);
            int[] currInterval = arr[i];

            if (currInterval[0] <= lastInterval[1]) {
                lastInterval[1] = Math.max(currInterval[1], lastInterval[1]);
            }
            else {
                res.add(currInterval);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {6, 8},
            {1, 9},
            {2, 4},
            {4, 7}
        };

        ArrayList<int[]> merge = mergeOverlap(arr);

        for (int[] interval : merge) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "] ");
        }
    }
}
