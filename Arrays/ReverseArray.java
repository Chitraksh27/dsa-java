// Java program to reverse an array

// Asked by Bloomberg, Facebook, TCS, Adobe, Google, Infosys, Capgemini, Morgan Stanley, Amazon, Microsoft, Apple, Yahoo, PayPal and Uber

public class ReverseArray {
    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};
        System.out.println("Original array:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        System.out.println();

        reverseArray(arr);
        System.out.println("Array after reversal:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
