// Java program to count the number of possible triangles in an array of lengths

// Asked by Amazon and Microsoft

public class CountPossibleTriangles {
    static int countTriangles(int[] arr) {
        int ans = 0;
        for (int i = 2; i < arr.length; i++) {
            int left = 0, right = i - 1;
            while (left < right) {
                if (arr[left] + arr[right] > arr[i]) {
                    ans += right - left;
                    right--;
                }
                else {
                    left++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {10, 21, 22, 100, 101, 200, 300};
        System.out.println(countTriangles(arr));
    }
}
