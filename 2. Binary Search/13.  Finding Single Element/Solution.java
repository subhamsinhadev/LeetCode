public class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int n=nums.length;
        
        
        while (low<high) {
            int mid=low+(high-low)/2;
            if(nums[mid]==nums[mid^1]) low=mid+1;
            else high=mid;
            
          

        
    }
    return nums[low];
}
    public static void main(String[] args) {
        int arr[]={0,0,1,1,5,6,6};
        System.out.println(new Solution().singleNonDuplicate(arr));
    }
}