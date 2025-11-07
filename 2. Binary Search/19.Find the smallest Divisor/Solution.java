import java.util.Arrays;

public class Solution {
    // public int smallestDivisors(int[] nums, int threshold) {
    // int high = Arrays.stream(nums).high().getAsInt();
    // int sum = 0;
    // for (int i = 1; i < high; i++) {
    // int sumx = cielDivision(nums, i);

    // if (sumx <= threshold) {

    // return i;

    // }

    // }

    // return high;

    // }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int sumx = cielDivision(nums, mid);
            if (sumx <= threshold) {
                ans = mid;
                high = mid - 1;

            } else {

                low = mid + 1;

            }

        }

        return ans;

    }

    public static int cielDivision(int nums[], int divisor) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            double d = (double) nums[i] / divisor;
            sum += (int) Math.ceil(d);

        }

        return sum;

    }

    public static void main(String[] args) {

        int arr[] = { 21212, 10101, 12121 };
        int threshold = 1000000;

        System.out.println(new Solution().smallestDivisor(arr, threshold));
    }
}