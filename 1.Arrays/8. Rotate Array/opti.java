import java.util.Arrays;

class Solution {
    public void int[] rotate(int[] nums, int k) {
        int n=nums.length;

        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);


       
      
        

       
    }
    public  void reverse(int[] nums,int start,int end){

        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
public class opti {
    public static void main(String[] args) {
           int arr[]={15,25,35,45};
        System.out.println(Arrays.toString(Solution.rotate(arr, 1)));
    }
}
