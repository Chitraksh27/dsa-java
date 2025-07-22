// Java program to find and return the element that is greater than its neighbors

// Asked by Accolite, Amazon, Visa, Adobe and Google

public class PeakElement {
    public static int peakElement(int[] arr) {
        int n = arr.length;

        if (n == 1)
            return 0;

        if (arr[0] > arr[1])
            return 0;

        if (arr[n - 1] > arr[n - 2])
            return n - 1;

        int low = 1, high = n - 2;

        while (low <= high) {
            int mid = low + (high - low)/2;

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
                return mid;
            if (arr[mid] < arr[mid - 1])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 2, 23, 90, 80};
        System.out.println(peakElement(arr));
    }
}