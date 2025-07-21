// Java program to find whether there exist two distinct indices such that the sum of their elements is equal to the target

// Asked by Zoho, Flipkart, Morgan Stanley, Accolite, Amazon, Microsoft, FactSet, Hike, Adobe, Google, Wipro, SAP Labs, CarWale

import java.util.*;

public class TwoSum {
    public static boolean twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int rem = target - arr[i];
            if (mpp.containsKey(rem))
                return true;
            mpp.put(arr[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, -2, 1, 0, 5};
        int target = 0;

        System.out.println(twoSum(arr, target));
    }
}
