// Java program to find number of pairs in an array which sums up to target. It is given that the elements of the arr[] are in sorted order.

// Asked by Adobe

public class PairWithGivenSumSorted {
    public static int countPairs(int[] arr, int target) {
        int res = 0;
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum < target)
                left++;
            else if (sum > target)
                right--;
            else {
                int ele1 = arr[left], ele2 = arr[right];
                int cnt1 = 0, cnt2 = 0;
                while (left <= right && arr[left] == ele1) {
                    cnt1++;
                    left++;
                }
                while (left <= right && arr[right] == ele2) {
                    cnt2++;
                    right--;
                }
                if (ele1 == ele2)
                    res += (cnt1 * (cnt1 - 1)) / 2;
                else
                    res += (cnt1 * cnt2);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {-1, 1, 5, 5, 7};
        int target = 6;
        System.out.println(countPairs(arr, target));
    }
}
