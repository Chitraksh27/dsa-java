// Java program to perform spiral traversal of a matrix

// Asked by Paytm, Flipkart, Morgan Stanley, Microsoft, OYO Rooms, Snapdeal, D-E-Shaw, MakeMyTrip, Oracle, MAQ Software, Adobe, nearbuy, Nagarro, BrowserStack, Salesforce and Zoho

import java.util.*;

public class SpiralTraversal {
    public static ArrayList<Integer> spirallyTraverse(int[][] mat) {
        ArrayList<Integer> result = new ArrayList<>();

        int n = mat.length;
        int m = mat[0].length;
        int top = 0, bottom = n - 1, left = 0, right = m - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result.add(mat[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result.add(mat[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(mat[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(mat[i][left]);
                }
                left++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        ArrayList<Integer> res = spirallyTraverse(mat);

        for (int ele : res) {
            System.out.print(ele + " ");
        }
    }
}
