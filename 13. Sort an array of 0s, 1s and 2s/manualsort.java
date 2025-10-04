import java.util.ArrayList;

public class manualsort {
    class Solution {

        //let us reduce space complexity
    public static ArrayList sortColors(int[] nums) {
        int n=nums.length;
        int count0=0;
        int count1=0;
        int count2=0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                count0++;
            }
            if (nums[i]==1) {
                count1++;
                
            }
             if (nums[i]==2) {
                count2++;
                
            }
            
        }
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i < count0; i++) {
            arrayList.add(0);
            
        }
        for (int i = count0; i < count0+count1; i++) {
            arrayList.add(1);
            
            
        }
         for (int i = count1; i < count1+count2; i++) {
            arrayList.add(2);
            
            
        }
        return arrayList;
    }
}
    public static void main(String[] args) {
        int nums[]={2,0,0,2,2,1};
        ArrayList arrayList=Solution.sortColors(nums);

        for (int i = 0; i < arrayList.size(); i++) {

            System.out.print(arrayList.get(i));
            
        }
        System.out.println();
    }
    
}
