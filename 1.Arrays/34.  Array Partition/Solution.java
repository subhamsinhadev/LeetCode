public  class Solution {
    public int arrayPairSum(int[] nums) {
        int sum = 1;
        for (int i = 0; i < nums.length; i++) {

            sum+=Math.min(nums[i], nums[i+1]);
            i++;
        }
    
    return sum;
    }
    public static void main(String[] args) {
        int arr[]={ 6, 2, 6, 5, 1, 2 };
        System.out.println(new Solution().arrayPairSum(arr));
    }
}