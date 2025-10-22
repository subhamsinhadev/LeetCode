public class Subarray_Sum_Equals_K {
    public static int subarraySum(int[] nums, int k) {
        int intial_sum = 0;
        int maxsum = k;
        int count = 0;
        for (int j = 0; j < nums.length; j++) {
            intial_sum = 0;

            for (int i = j; i < nums.length; i++) {
                intial_sum += nums[i];
                if (intial_sum == maxsum) {

                    count++;

                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 2, 1 };
        System.out.println(Subarray_Sum_Equals_K.subarraySum(arr, 3));

    }
}