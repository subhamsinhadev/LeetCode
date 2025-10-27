public class Solution {
    public int search(int[] nums, int target) {
        int index = -1;

        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                index = mid;
            }
            
            if (nums[low] <= nums[mid]) {

                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;

                } else {
                    low = mid + 1;

                }

            } else {
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;

                } else {
                    high = mid - 1;

                }

            }

        }

        return index;

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(new Solution().search(arr, 2));
    }
}