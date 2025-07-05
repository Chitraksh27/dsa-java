// Java program to maximize the number of 1's in a binary array by flipping at most one subarray

/* Asked by Accolite, Amazon, Microsoft, MakeMyTrip */

public class MaximizeNumberof_1 {
    static int maxOnes(int arr[], int k) {
        int res = 0;
        int count = 0;
        int left = 0, right = 0;

        while (right < arr.length) {
            if (arr[right] == 0) {
                count++;
            }

            while (count > k) {
                if (arr[left] == 0)
                    count--;
                left++;
            }
            res = Math.max(res, (right - left + 1));
            right++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 1, 0, 1};
        int k = 2;

        System.out.println(maxOnes(arr, k));
    }
}
