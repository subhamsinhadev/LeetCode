import java.util.ArrayList;
//two pointer approach
class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=0){
            swap(nums,i,j);
            i++;

            }
            
        }
    
       
        for (int k = 0; k < nums.length; k++) {
            System.out.println(nums[k]+" ");
            
        }

    }
    private  void swap(int arr[],int i,int j){
        int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;

        

    }

    
}


public class zerotoend {

    public static void main(String[] args) {
        int arr[]={10,0,20,0};
       new Solution().moveZeroes(arr);

        
    }
}