// Java program to search an element in a sorted rotated array

// Asked by Paytm, Flipkart, Amazon, Microsoft, Snapdeal, D-E-Shaw, FactSet, Hike, MakeMyTrip, Intuit, Adobe, Google, BankBazaar and Times Internet

public class SearchinSortedRotated {
    public static int search(int[] arr, int key) {
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low)/2;

            if (arr[mid] == key)
                return mid;

            if (arr[mid] >= arr[low]) {
                if (key >= arr[low] && key < arr[mid])
                    high = mid - 1;
                else 
                    low = mid + 1;
            }
            else {
                if (key > arr[mid] && key <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 3;

        System.out.println(search(arr, key));
    }
}
