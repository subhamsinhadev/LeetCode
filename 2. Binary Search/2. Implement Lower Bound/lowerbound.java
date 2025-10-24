public class lowerbound {
    // lower bound if arr[mid]>=target
    public static int BSLB(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3 };
        int arrs[] = { 3, 5, 8, 15, 19 };

        System.out.println(new lowerbound().BSLB(arr, 2));

    }
}
