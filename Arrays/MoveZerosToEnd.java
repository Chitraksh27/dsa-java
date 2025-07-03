// Java program to move all zeros to end of array while maintaining the relative order of all non-zero elements

// Asked by Paytm, Amazon, Microsoft, Samsung, SAP Labs, LinkdIn and Bloomberg

public class MoveZerosToEnd {
    public static void pushZerostoEnd(int [] arr) {
        int i = 0;

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};

        System.out.println("Original Array: ");

        for (int num: arr) {
            System.out.print(num + " ");
        }

        pushZerostoEnd(arr);
        
        System.out.println();
        
        System.out.println("Array after moving zeros to the end of the array: ");

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
