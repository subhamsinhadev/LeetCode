import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // nums1 ke last valid element ka index
        int i = m - 1;

        // nums2 ke last element ka index
        int j = n - 1;

        // nums1 ke total array ka last index (jahan se fill karna start karenge)
        int k = m + n - 1;

        // dono arrays ko end se compare karke merge kar rahe hain
        while (i >= 0 && j >= 0) {
            // agar nums1[i] chhota hai nums2[j] se to bada element nums2[j] hoga
            // sahi logic yeh hona chahiye:
            if (nums1[i] > nums2[j]) {
                // agar nums1 ka element bada hai to use end me daal do
                nums1[k--] = nums1[i--];
            } else {
                // warna nums2 ka element daal do
                nums1[k--] = nums2[j--];
            }
        }

        // agar nums2 me kuch elements bache hain to unhe daal do
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

        // final merged array print kar rahe hain
        for (int ii : nums1) {
            System.out.print(ii + " ");
        }
    }

    public static void main(String[] args) {
        int nums1[] = {-1, 0, 0, 3, 3, 3, 0, 0, 0};
        int m = 6;
        int nums2[] = {1, 2, 2};
        int n = 3;
        new Solution().merge(nums1, m, nums2, n);
    }
}
