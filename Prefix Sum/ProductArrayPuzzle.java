// Java program to find the product of all elements in an array except the current element

// Asked by Flipkart, Morgan Stanley, Accolite, Amazon, Microsoft, D-E-Shaw, Intuit and Opera

public class ProductArrayPuzzle {
    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length;

        int[] prefSum = new int[n];
        int[] suffSum = new int[n];

        prefSum[0] = 1;

        for (int i = 1; i < n; i++) {
            prefSum[i] = prefSum[i - 1] * arr[i - 1];
        }

        suffSum[n - 1] = 1;
        for (int i = n - 2; i >=0; i--) {
            suffSum[i] = suffSum[i + 1] * arr[i + 1];
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = prefSum[i] * suffSum[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};

        int[] ans = productExceptSelf(arr);

        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}
