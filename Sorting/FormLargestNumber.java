// Java program to form the largest possible number from a given array of non-negative integers.

// Asked by Paytm, Zoho, Amazon, Microsoft and MakeMyTrip

import java.util.*;

public class FormLargestNumber {
    static boolean myCompare(String a, String b) {
        return (a + b).compareTo(b + a) > 0;
    }
    static String findLargest(int[] arr) {
        ArrayList<String> numList = new ArrayList<>();

        for (int num : arr) {
            numList.add(Integer.toString(num));
        }

        Collections.sort(numList, (s1, s2) -> myCompare(s1, s2) ? -1 : 1);

        if (numList.get(0).equals("0")) {
            return "0";
        }

        StringBuilder largestNum = new StringBuilder();

        for (String number : numList) {
            largestNum.append(number);
        }
        return largestNum.toString();
    }
    public static void main(String[] args) {
        int[] arr = {54, 546, 548, 60};

        System.out.println(findLargest(arr));
    }
}
