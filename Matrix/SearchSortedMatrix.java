// Java program to search an integer in a strictly sorted matrix

// Asked by Paytm, Accolite, MakeMyTrip, Ola Cabs, Oracle, Visa, Goldman Sachs, Directi, Groupon, InMobi, One97, Polycom and TinyOwl

public class SearchSortedMatrix {
    public static boolean searchMatrix(int[][] mat, int x) {
        int m = mat[0].length;
        int n = mat.length;

        int left = 0, right = m*n - 1;

        while (left <= right) {
            int mid = left + (right - left)/2;

            int row = mid / m;
            int col = mid % m;

            if (mat[row][col] == x)
                return true;
            else if (mat[row][col] > x)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] mat = {
            {1, 5, 9, 11},
            {14, 20, 21, 26},
            {30, 34, 43, 50}
        };

        int x = 42;

        if (searchMatrix(mat, x))
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
}
