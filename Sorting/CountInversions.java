// Java program to count the number of inversions in an array (Brute Force Approach)

// Asked by Flipkart, Amazon, Microsoft, MakeMyTrip, Adobe, BankBazaar and Myntra

public class CountInversions {
    static int inversionCount(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};

        System.out.println(inversionCount(arr));
    }
}
