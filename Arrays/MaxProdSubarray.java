// Java program to find the maximum product that can be obtained from a subarray

// Asked by Morgan Stanley, Amazon, Microsoft, OYO Rooms, D-E-Shaw, Google

public class MaxProdSubarray {
    public static int maxProduct(int[] arr) {
        int maxProd = Integer.MIN_VALUE;
        int ltr = 1;
        int rtl = 1;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (ltr == 0) {
                ltr = 1;
            }
            if (rtl == 0) {
                rtl = 1;
            }
    
            ltr *= arr[i];
    
            int j = n - i - 1;
    
            rtl *= arr[j];
    
            maxProd = Math.max(ltr, Math.max(rtl, maxProd));
        }

        return maxProd;
    }

    public static void main(String[] args) {
        int arr[] = { -2, 6, -3, -10, 0, 2 };

        System.out.println(maxProduct(arr));
    }
}
