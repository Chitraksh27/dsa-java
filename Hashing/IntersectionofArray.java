// Java program to find the intersection of two arrays

import java.util.*;

public class IntersectionofArray {
    public static ArrayList<Integer> intersection(int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int ele : a) {
            set.add(ele);
        }
        for (int ele : b) {
            if (set.contains(ele)) {
                result.add(ele);
                set.remove(ele);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 3, 1};
        int[] b = {3, 1, 3, 4, 1};

        ArrayList<Integer> result = intersection(a, b);
        System.out.println(result);
    }
}
