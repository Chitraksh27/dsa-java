// Java program to find and return the length of the longest subarray with equal number of 0s and 1s

// Asked by Paytm, Morgan Stanley, Amazon and MakeMyTrip

import java.util.*;

public class LargestSubarray0and1 {
    public static int maxLen(int[] arr) {
        int len = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefSum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefSum += (arr[i] == 0) ? -1 : 1;

            if (prefSum == 0)
                len = i + 1;

            if (map.containsKey(prefSum))
                len = Math.max(len, i - map.get(prefSum));
            else 
                map.put(prefSum, i);
        }
        return len;
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 1, 0, 0};
        System.out.println(maxLen(arr));
    }
}
