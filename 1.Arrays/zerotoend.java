import java.util.ArrayList;

class Solution {
    public void moveZeroes(int[] nums) {
    
        ArrayList<Integer> temp=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                temp.add(nums[i]);
            }
        
            
        }

        int nz=temp.size();
        for (int i = 0; i < nz; i++) {
            nums[i]=temp.get(i);
            
        }
        for (int i = nz; i < nums.length; i++) {
            nums[i]=0;
            
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]+" ");
            
        }

    }
}


public class zerotoend {

    public static void main(String[] args) {
        int arr[]={10,0,20,0};
       new Solution().moveZeroes(arr);

        
    }
}