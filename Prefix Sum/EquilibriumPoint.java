// Java program to find the point in an array where the sum of elements on the left is equal to the sum of elements on the right.

// Asked by Amazon, Adobe, Google, Facebook, Microsoft and Uber

public class EquilibriumPoint {
    public static int findEquilibrium(int[] arr) {
        int n = arr.length;

        int totSum = 0;
        int prefSum = 0;

        for (int i = 0; i < n; i++) {
            totSum += arr[i];
        }

        for (int i = 0; i < n; i++) {
            int suffixSum = totSum - prefSum - arr[i];
            
            if (prefSum == suffixSum)
                return i;
            prefSum += arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(findEquilibrium(arr));
    }
}
