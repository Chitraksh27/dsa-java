// Java program to move all zeros to end of an array

// Asked by Paytm, Amazon, Microsoft, Samsung, SAP Labs, LinkedIn and Bloomberg

public class MoveZerosEnd {
    static void pushZerosToEnd(int[] arr) {
        int i = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};

        System.out.println("Original array:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        System.out.println();

        pushZerosToEnd(arr);
        System.out.println("Array after pushing zeros to the end:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
