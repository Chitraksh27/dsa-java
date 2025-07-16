// Java program to sort an array containing 0s, 1s, and 2s in ascending order

// Asked by Paytm, Flipkart, Morgan Stanley, Amazon, Microsoft, OYO Rooms, Samsung, Snapdeal, Hike, MakeMyTrip, Ola Cabs, Walmart, MAQ Software, Adobe, Yatra.com, SAP Labs and Qualcomm

public class DutchFlag {
    static void sort012(int[] arr) {
        int l = 0, m = 0, r = arr.length - 1;

        while (m <= r) {
            if (arr[m] == 0) {
                int temp = arr[l];
                arr[l] = arr[m];
                arr[m] = temp;
                l++;
                m++;
            }
            else if (arr[m] == 1) {
                m++;
            }
            else {
                int tem = arr[m];
                arr[m] = arr[r];
                arr[r] = tem;
                r--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

        for (int e : arr) {
            System.out.print(e + " ");
        }

        sort012(arr);

        System.out.println();
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
