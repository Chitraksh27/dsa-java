// Java program to find the second largest element in an array

// Asked by SAP Labs and Rockstand

public class SecondLargest {
    public static int getSecondLargest(int[] arr) {
        int secMax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            }
            else if (arr[i] < max && arr[i] > secMax) {
                secMax = arr[i];
            }
        }
        return secMax;
    }
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        System.out.println(getSecondLargest(arr));
    }
}
