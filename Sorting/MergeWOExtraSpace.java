

// Java program to merge two sorted arrays without using extra space

// Asked by Zoho, Microsoft, Snapdeal, Goldman Sachs, Adobe, LinkedIn, Amdocs, Brocade, Juniper Networks, Quikr and Synopsys

import java.util.Arrays;

public class MergeWOExtraSpace {
    static void mergeArrays(int[] a, int[] b) {
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

        for (int a1 : a) {
            System.out.print(a1 + " ");
        }
        System.out.println();

        for (int b1 : b) {
            System.out.print(b1 + " ");
        }
        System.out.println();

        mergeArrays(a, b);

        for (int ele : a) {
            System.out.print(ele + " ");
        }
        for (int ele : b) {
            System.out.print(ele + " ");
        }
    }
}
