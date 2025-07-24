// Java program to find the number of subarrays with a sum equal to k

// Asked by Microsoft

import java.util.*;

public class SubarraysSumK {
    public static int cntSubarrays(int[] arr, int k) {
        int res = 0;
        int sum = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k)
                res++;

            if (mpp.containsKey(sum - k))
                res += mpp.get(sum - k);

            mpp.put(sum, mpp.getOrDefault(sum, 0) + 1);
        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr = {9, 4, 20, 3, 10, 5};
        int k = 33;

        System.out.println(cntSubarrays(arr, k));
    }
}
