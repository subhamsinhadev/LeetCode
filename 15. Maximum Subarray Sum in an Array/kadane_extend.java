class Solution {
    public int maxSubArray(int[] nums) {
       int arr[]=new int[nums.length];
        int curr_max=nums[0];
        int max_sum=nums[0];
        for (int i = 1; i < nums.length; i++) {
            curr_max=Math.max(nums[i], curr_max+nums[i]);
            if(nums[i]<cumax_sum){
                arr[i]=nums[i];
            }else{
                arr[i]=max_sum;
            }
            max_sum=Math.max(curr_max,max_sum);
           // arr[i]=max_sum;

            
        }   
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

            
        }     
   return max_sum;
    }
}

public class kadane_extend{
    public static void main(String[] args) {
       int arr[]={-2,1,-3,4,-1,2,1,-5,4};
    int max_sum_subarr=new Solution().maxSubArray(arr);
        System.out.println("---"+max_sum_subarr);
    }
    

    
}
