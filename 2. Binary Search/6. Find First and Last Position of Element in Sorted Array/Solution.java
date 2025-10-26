public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=firstOccurence(nums, target);
        int last=lastOccurence(nums,target);
        

        return new int[] {first,last};


    }

    public int firstOccurence(int[] nums,int target){
        

        int low = 0;
        int high = nums.length-1;
        int start = -1;
        
    
       while (low<=high) {
        int mid = low + (high - low) / 2;
            if (nums[mid] == target) {

                //ye mera starting store karega 
                start = mid;


                high = mid - 1;
                

            } else if (nums[mid] < target) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }

        }

        return start;

    }

    public int lastOccurence(int[] nums,int target){
        

        int low = 0;
        int high = nums.length-1;
        int end = -1;
        
    
       while (low<=high) {
        int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                end = mid;
                low = mid + 1;
                //ye forward chalega kyunki hum sorted arr liye h toh last occurence uska next hi hoga na 
            

            } else if (nums[mid] < target) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }

        }

        return end;}
    

    public static void main(String[] args) {
        int arr[] = {1};
        int[] s = new Solution().searchRange(arr, 1);
        System.out.println(s[0] + "--" + s[1]);
    }
}