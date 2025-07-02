// Java program to find the next lexicographically greater permutation of an array
public class NextPermutation {
    static void nextPermutation(int[] arr) {
        int n = arr.length;
        int pvt = -1;

        for (int i = n- 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pvt = i;
                break;
            }
        }

        if (pvt == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > pvt; i--) {
            if (arr[i] > arr[pvt]) {
                int temp = arr[i];
                arr[i] = arr[pvt];
                arr[pvt] = temp;
                break;
            }
        }

        reverse(arr, pvt + 1, n - 1);
    }
    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 7, 5, 0 };

        nextPermutation(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
