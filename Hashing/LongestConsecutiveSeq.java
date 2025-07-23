// Java program to find the length of the longest consecutive sequence in an unsorted array (brute force approach)

// Asked by Amazon, Microsoft and Walmart

import java.util.*;

public class LongestConsecutiveSeq {
    static int longestConsecutive(int[] arr) {
        Arrays.sort(arr);
        int count = 1, result = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])
                continue;

            if (arr[i] == arr[i - 1] + 1)
                count++;
            else 
                count = 1;

            result = Math.max(result, count);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {15, 13, 12, 14, 11, 10, 9};
        System.out.println(longestConsecutive(arr));
    }
}
