public class maj {

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int majorityCount = n / 2;

        for (int i = 0; i < n; i++) {
            int count = 0;  // ✅ reset count for each element
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count > majorityCount) {
                return nums[i];
            }
        }
        return -1; // no majority element
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("maj: " + majorityElement(arr));
    }
}
