import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
    
        //if size <  4
        if(nums==null||nums.length<4) return new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> set=new HashSet<>();


        for (int i = 0; i < nums.length-3; i++) {
            for (int j =i+1; j < nums.length-2; j++) {
                int left=j+1;
                int right=nums.length-1;
                while(left<right){
                    long sum=(long) nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        set.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;



                    }else if(sum<target){
                        left++;
                        
                    }else{
                        right--;
                    }
                }
 
            
                
            }
           
            
            
        }

    return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int arr[] = {1000000000,1000000000,1000000000,1000000000};
        List<List<Integer>> se = new Solution().fourSum(arr, -294967296);
        System.out.println(se);

    }
}