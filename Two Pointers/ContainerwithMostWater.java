// Java program to find the maximum amount of water that can be contained between any two lines, together with the x-axis

// Asked by Flipkart, Amazon and Google

public class ContainerwithMostWater {
    static int maxWater(int arr[]) {
        int left = 0, right = arr.length - 1;
        int max = 0;

        while (left <= right) {
            int water = Math.min(arr[left], arr[right]) * (right - left);

            max = Math.max(max, water);

            if (arr[left] < arr[right])
                left++;
            else
                right--;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 8, 6, 4, 6, 5, 5};
        System.out.println(maxWater(arr));
    }
}
