class Solution {
    public int maxSubArray(int[] nums) {
        int curr_max=nums[0];
        int max_sum=nums[0];
        for (int i = 1; i < nums.length; i++) {
            curr_max=Math.max(nums[i], curr_max+nums[i]);
            max_sum=Math.max(curr_max,max_sum);

            
        }        
   return max_sum;
    }
}

public class kadane {
    public static void main(String[] args) {
       int arr[]={-2,1,-3,4,-1,2,1,-5,4};
    int max_sum_subarr=new Solution().maxSubArray(arr);
        System.out.println(max_sum_subarr);
    }
    

    
}
