public class Solution {
    public int maxProduct(int[] nums) {
        int cur_product = nums[0];
        int min_product = nums[0];
        int max_product = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<0){
                int temp=cur_product;
                cur_product=min_product;
                min_product=temp;
            }
            cur_product=Math.max(nums[i], cur_product*nums[i]);
            min_product=Math.min(nums[i], min_product*nums[i]);
            max_product=Math.max(cur_product, max_product);

        }
        return max_product;
    }
    public static void main(String[] args) {
        int[] arr={-2,3,-4};
        System.out.println(new Solution().maxProduct(arr));
    }
}