// Java program to find the next lexicographical permutation of an array of integers.

// Asked by Infosys, Flipkart, Amazon, Microsoft, FactSet, Hike, MakeMyTrip, Google, Qualcomm and Salesforce

public class NextPermutation {
    static void reverse(int[] arr, int end1, int end2) {
        while (end1 < end2) {
            int temp = arr[end1];
            arr[end1] = arr[end2];
            arr[end2] = temp;
            end1++;
            end2--;
        }
    }
    static void nextPermutation(int[] arr) {
        int pivot = -1;
        int n = arr.length;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        for (int i = n - 1; i >= pivot; i--) {
            if (arr[i] > arr[pivot]) {
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                break;
            }
        }
        reverse(arr, pivot + 1, n - 1);
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 5, 1};

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        System.out.println();
        nextPermutation(arr);

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}