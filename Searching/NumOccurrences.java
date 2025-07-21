// Java program to find the number of occurrences of a given element in an array

// Asked by Zoho, Amazon and MakeMyTrip

public class NumOccurrences {
    static int lowBound(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int res = arr.length;
        while (low <= high) {
            int mid = low + (high - low)/2;

            if (arr[mid] >= target) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
    static int highBound(int[] arr, int target) {
        int res = arr.length;
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low)/2;

            if (arr[mid] > target) {
                res = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return res;
    }
    public static int countFreq(int[] arr, int target) {
        int lb = lowBound(arr, target);
        int hb = highBound(arr, target);

        return hb - lb;
    }
    public static void main(String[] args) {
        int[] arr = {8, 9, 10, 12, 12, 12};
        int target = 12;

        System.out.println(countFreq(arr, target));
    }
}
