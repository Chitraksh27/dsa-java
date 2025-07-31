// Java program to compute how much water an elevation map can trap after rain

// Asked by Flipkart, Amazon, Microsoft, Google and Goldman Sachs

public class TrappingRainWater {
    static int maxWater(int[] arr) {
        int left = 1;
        int right = arr.length - 2;
        int res = 0;
        int maxLeft = arr[0], maxRight = arr[arr.length - 1];
        while (left <= right) {
            if (maxLeft <= maxRight) {
                res += Math.max(0, maxLeft - arr[left]);
                maxLeft = Math.max(arr[left], maxLeft);
                left++;
            }
            else {
                res += Math.max(0, maxRight - arr[right]);
                maxRight = Math.max(maxRight, arr[right]);
                right--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 0, 4, 0, 2};
        System.out.println(maxWater(arr));
    }
}
