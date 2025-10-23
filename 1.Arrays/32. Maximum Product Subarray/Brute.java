public class Brute {

   
    public static void main(String[] args) {
        int[] arr={-2,3,-4};

        System.out.println(new Solution().maxProduct(arr));
    }
}

  class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            int product=1;
            for(int j=i;j<nums.length;j++){
                
                product=product*nums[j];
                max=Math.max(max,product);
                

            }
        }
      return max;  
    }
}
