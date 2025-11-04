import java.util.Arrays;

public class Solution {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int val =nums[i];

            sum += val;
            i++;

        }

        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 2, 6, 5, 1, 2 };
        System.out.println(new Solution().arrayPairSum(arr));
    }
}