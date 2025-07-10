// Java program to search an element in a sorted matrix

// Asked by Paytm, Accolite, MakeMyTrip, Ola Cabs, Oracle, Visa, Goldman Sachs, Directi, Groupon, InMobi, One97, Polycom, TinyOwl

public class SearchSortedMatrix {
    static boolean searchMatrix(int[][] mat, int x) {
        int n = mat.length;
        int m = mat[0].length;

        int low = 0, high = n * m - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int row = mid / m;
            int col = mid % m;

            if (mat[row][col] == x)
                return true;
            else if (mat[row][col] > x)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return false;
    }
    public static void main(String[] args) {
        int[][] mat = {{1, 5, 9}, {14, 20, 21}, {30, 34, 43}};
        int x = 14;

        if (searchMatrix(mat, x))
            System.out.println(x + " is present in the matrix");
        else
            System.out.println(x + " is not present in the matrix");
    }
}
