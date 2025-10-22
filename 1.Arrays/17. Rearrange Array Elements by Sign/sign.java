class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];

        int postindex = 0;
        int negindex = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                arr[postindex] = nums[i];
                postindex += 2; // point to next even index
            } else {

                arr[negindex] = nums[i];
                negindex += 2;// point to next odd index
            }

        }

        return arr;
    }
}

public class sign {
    public static void main(String[] args) {
        int arr[] = { -1, 1 };
        int result[] = new Solution().rearrangeArray(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }

    }
}
