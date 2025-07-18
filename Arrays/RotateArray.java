// Java program to rotate an array to the left by d steps

// Asked by Amazon, Microsoft and MAQ Software

public class RotateArray {
    static void reverseArr(int[] arr, int st, int end) {
        while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
    static void rotateArray(int[] arr, int d) {
        int n = arr.length;
        d = d % n;

        reverseArr(arr, 0, d - 1);
        reverseArr(arr, d, n - 1);
        reverseArr(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int d = 3;

        System.out.println("Original array:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        rotateArray(arr, d);

        System.out.println("Array after rotation:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
