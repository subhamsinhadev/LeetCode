import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //if size < 3 
        if(nums==null||nums.length<3) return new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> set=new HashSet<>();


        for (int i = 0; i < nums.length-2; i++) {
            int left=i+1;
            int right=nums.length-1;
            while ((left<right)) {
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    set.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;

                }else if(sum<0){
                    left++;


                }else{
                    right--;
                }
                
            }
            
        }

    return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
         List<List<Integer>> se= new Solution().threeSum(arr);
         System.out.println(se);
        
    }
}