// Java program to find the maximum product that can be obtained from a subarray.

// Asked by Morgan Stanley, Amazon, Microsoft, OYO Rooms, D-E-Shaw and Google

public class MaxProdSubarray {
    public static int maxProduct(int[] arr) {
        int n = arr.length;

        int lefttoright = 1;
        int righttoleft = 1;
        int maxProd = 1;

        for (int i = 0; i < n; i++) {
            if (lefttoright == 0)
                lefttoright = 1;
            if (righttoleft == 0)
                righttoleft = 1;

            lefttoright *= arr[i];

            int j = n - i - 1;
            righttoleft *= arr[j];

            maxProd = Math.max(maxProd, Math.max(lefttoright, righttoleft));
        }
        return maxProd;
    }
    public static void main(String[] args) {
        int[] arr = {-1, -3, -10, 0, 6};

        System.out.println(maxProduct(arr));
    }
}
