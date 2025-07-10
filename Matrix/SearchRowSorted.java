// Given a 2D integer matrix mat[][] of size n x m, where every row and column is sorted in increasing order and a number x, the task is to find whether element x is present in the matrix.

// Asked by Paytm, Accolite, Amazon, Microsoft, Snapdeal, MakeMyTrip, Ola Cabs, Oracle, Visa, Goldman Sachs, Directi, Adobe, SAP Labs, Groupon, InMobi, One97, Polycom, TinyOwl

public class SearchRowSorted {
    static boolean searchRow(int[] row, int x) {
        int n = row.length;
        int left = 0, right = n - 1;
        
        while(left <= right) {
            int mid = left + (right - left)/2;

            if (row[mid] == x)
                return true;
            else if (row[mid] < x) 
                left = mid + 1;
            else
                right = mid - 1;
        }

        return false;
    }
    public static boolean matSearch(int mat[][], int x) {
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            if (searchRow(mat[i], x))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{18, 21, 27}, {38, 55, 67}};
        int x = 55;

        if (matSearch(matrix, x))
            System.out.println(x + " is present in the matrix");
        else
            System.out.println(x + " is not present in the matrix");
    }
}
