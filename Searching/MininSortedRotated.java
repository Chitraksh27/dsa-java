// Java program to find the minimum element in a sorted and rotated array

// Asked by Morgan Stanley, Amazon, Microsoft, Samsung, Snapdeal, Adobe and Times Internet

public class MininSortedRotated {
    public static int findMin(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;

        while(low < high) {
            if (arr[low] < arr[high]) {
                return arr[low];
            }
            int mid = low + (high - low)/2;

            if (arr[mid] > arr[high])
                low = mid + 1;
            else
                high = mid;
        }
        return arr[low];
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};
        System.out.println(findMin(arr));
    }
}
