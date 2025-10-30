public class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int n=nums.length;
        while (low<=high) {
            int mid=low+(high-low)/2;
            int next=nums[mid+1]%n;
            int prev=nums[mid+n-1]%n;
            
            
        }
        

        return -1;
        
    }
}