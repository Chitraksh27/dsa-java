// Java program to search a number in a matrix where every row and column is sorted in increasing order

// Asked by Paytm, Accolite, Amazon, Microsoft, Snapdeal, MakeMyTrip, Ola Cabs, Oracle, Visa, Goldman Sachs, Directi, Adobe, SAP Labs, Groupon, InMobi, One97, Polycom and TinyOwl

public class SearchRowColMatrix {
    static boolean isFound(int[] row, int x) {
        int left = 0, right = row.length - 1;

        while (left <= right) {
            int mid = left + (right - left)/2;

            if (row[mid] == x)
                return true;
            else if (row[mid] > x)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return false;
    }
    public static boolean matSearch(int mat[][], int x) {
        for (int i = 0; i < mat.length; i++) {
            if (isFound(mat[i], x))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {18, 21, 27},
            {38, 55, 67}
        };
        int x = 55;

        if (matSearch(mat, x))
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
}
