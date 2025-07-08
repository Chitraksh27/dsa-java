// Java program to merge two sorted arrays without using any extra space

// Asked by Zoho, Microsoft, Snapdeal, Goldman Sachs, Adobe, LinkedIn, Amdocs, Brocade, Juniper Networks, Quikr, Synopsys

import java.util.Arrays;

public class MergeWithoutExtraSpace {
    public static void mergeArrays(int a[], int b[]) {
        int i = a.length - 1;
        int j = 0;

        while (i >= 0 && j < b.length && a[i] > b[j]) {
            int temp = a[i];
            a[i] = b[j];
            b[j] = temp;
            i--;
            j++;
        }

        Arrays.sort(a);
        Arrays.sort(b);
    }
    public static void main(String[] args) {
        int[] a = {2, 4, 7, 10};
        int[] b = {2, 3};

        mergeArrays(a, b);

        System.out.println("Merged Array: " + Arrays.toString(a) + " " + Arrays.toString(b));
    }
}
