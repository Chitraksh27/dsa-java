// Java program to return an array while traversing a matrix in spiral order

// Asked by Paytm, Flipkart, Morgan Stanley, Microsoft, OYO Rooms, Snapdeal, D-E-Shaw, MakeMyTrip, Oracle, MAQ Software, Adobe, nearbuy, Nagarro, BrowserStack, Salesforce and Zoho

import java.util.*;

public class SpiralTraversal {
    public static ArrayList<Integer> spirallyTraverse(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        int left = 0, right = m - 1, top = 0, bottom = n - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;
            if (left <= right) {
                for (int j = right; j >= left; j--) {
                    res.add(matrix[bottom][j]);
                }
            }
            bottom--;
            if (top <= bottom) {
                for (int j = bottom; j >= top; j--) {
                    res.add(matrix[j][left]);
                }
            }
            left++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        ArrayList<Integer> ans = spirallyTraverse(matrix);

        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}
