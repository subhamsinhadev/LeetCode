public class xor {
    class Solution {
    public static int singleNumber(int[] nums) {
        int n=nums.length;
        int xor=0;

        for(int i=0;i<n;i++){
            xor=xor^nums[i];
        }
        return xor;
        
    }
}
public static void main(String[] args) {
    int arr[]={2,4,2};
    System.out.println(Solution.singleNumber(arr));
    
    
}
    
}
