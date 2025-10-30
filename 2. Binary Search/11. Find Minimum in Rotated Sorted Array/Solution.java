public class Solution {
    public int findMin(int[] nums) {
        int min=0;
        int low=0;
        int high=nums.length-1;

        //kyunki hume loop ko extra nhi chalana h and prevent for low==high 
        while (low<=high) {
            int mid=low+(high-low)/2;

            if(nums[mid]>nums[high]){
                low=mid+1;
            }
            else{
                high=mid;
            }
            
        }
        if(high>=low){
        min=  nums[low];

        }
        return min;
        
    }
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        System.out.println(new Solution().findMin(arr));
    }
}