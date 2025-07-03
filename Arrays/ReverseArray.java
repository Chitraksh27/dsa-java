// Java program to reverse an array

// Asked by Bloomberg, Facebook, TCS, Adobe, Google, Infosys, Capgemini, Morgan Stanley, Amazon, Microsoft, Apple, Yahoo, PayPal and Uber

public class ReverseArray {
    public static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 6, 5};

        reverseArray(arr);

        for(int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
