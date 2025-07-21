// Java program to find the length of the longest subarray where the sum of the subarray is equal to a given value K

// Asked by Amazon

import java.util.*;

public class LongestSubarraywithKSum {
    public static int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefSum = 0;
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];

            if (prefSum == k)
                res = i + 1;

            else if (map.containsKey(prefSum - k))
                res = Math.max(res, i - map.get(prefSum - k));

            if (!map.containsKey(prefSum))
                map.put(prefSum, i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;

        System.out.println(longestSubarray(arr, k));
    }
}
