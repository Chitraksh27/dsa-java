// Java program to find the element that would be at the kth position in the merged array formed by merging two sorted arrays

// Asked by Flipkart and Microsoft

import java.util.*;

public class KthElementinMergedArrays {
    static int kthElement(int[] a, int[] b, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i : a) {
            minHeap.add(i);
        }
        for (int i : b)
            minHeap.add(i);

        while (k-- > 1)
            minHeap.poll();
        return minHeap.peek();
    }
    public static void main(String[] args) {
        int[] a = {100, 112, 256, 349, 770};
        int[] b = {72, 86, 113, 119, 265, 465, 892};
        int k = 7;

        System.out.println(kthElement(a, b, k));
    }
}
