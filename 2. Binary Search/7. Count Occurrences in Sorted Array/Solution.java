public class Solution {
    public int returnCount(int nums[], int x) {

        // tc O(n)
        // for (int i : nums) {
        //     if (i == x)
        //         count++;

        // }
        int first=firstOccurence(nums, x);
        int last=lastOccurence(nums, x);
        int count=last-first+1;


       
    
        
        return count;
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
        int arr[] = {2, 2 , 3 , 3 , 3 , 3 , 4};
        int x = 2;
        System.out.println("Count of" + x +":"+ new Solution().returnCount(arr, x));

    }
}