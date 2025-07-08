// Java program to sort an array containing only 0s, 1s and 2s

// Asked by Paytm, Flipkart, Morgan Stanley, Amazon, Microsoft, OYO Rooms, Samsung, Snapdeal, Hike, MakeMyTrip, Ola Cabs, Walmart, MAQ Software, Adobe, Yatra.com, SAP Labs and Qualcomm

public class Sort012 {
    public static void sort012(int[] arr) {
        int left = 0, mid = 0, right = arr.length - 1;

        while (mid <= right) {
            if (arr[mid] == 0) {
                int temp = arr[left];
                arr[left] = arr[mid];
                arr[mid] = temp;
                left++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else {
                int t = arr[mid];
                arr[mid] = arr[right];
                arr[right] = t;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        System.out.println("Initial Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sort012(arr);

        System.out.println("\nSorted Array: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}