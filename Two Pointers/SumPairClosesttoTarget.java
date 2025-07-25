// Java program to find the pair of elements in an array whose sum is closest to a given target

// Asked by Ola Cabs

import java.util.*;

public class SumPairClosesttoTarget {
    public static ArrayList<Integer> sumClosest(int[] arr, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        int minimumDiff = Integer.MAX_VALUE;
        while (left < right) {
            int currSum = arr[left] + arr[right];
            if (Math.abs(target - currSum) < minimumDiff) {
                minimumDiff = Math.abs(target - currSum);
                res.clear();
                res.add(arr[left]);
                res.add(arr[right]);
            }
            if (currSum < target)
                left++;
            else if (currSum > target)
                right--;
            else
                return res;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 1, 4};
        int target = 10;
        ArrayList<Integer> answer = sumClosest(arr, target);
        for (int ele : answer) {
            System.out.print(ele + " ");
        }
    }
}
