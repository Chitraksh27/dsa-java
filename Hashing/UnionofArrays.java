// Java program to find the union of two arrays using Hashing

// Asked by Zoho and Rockstand

import java.util.*;

public class UnionofArrays {
    public static ArrayList<Integer> union(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }
        result.addAll(set);
        return result;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 2, 3, 3, 2};

        ArrayList<Integer> result = union(a, b);
        System.out.println(result);
    }
}
