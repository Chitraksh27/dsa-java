// Java program to rotate a matrix 90 degrees anticlockwise

// Asked by Paytm, Microsoft, Samsung and Adobe

public class RotateAntiClock {
    static void reverseRow(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void rotateMatrix(int[][] mat) {
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            reverseRow(mat[i]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8}
        };

        for (int[] row : mat) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        rotateMatrix(mat);

        for (int[] row : mat) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
