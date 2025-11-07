import java.util.Arrays;

public class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int totalweight=Arrays.stream(weights).sum();
        int maxweight=Arrays.stream(weights).max().getAsInt();

        for (int i = maxweight; i <=totalweight; i++) {
            if(isShippingPossible(weights, days, i)){
                return i;
            

            }
            
        }
return totalweight;}
 public int shipWithinDayss(int[] weights, int days) {
        int totalweight=Arrays.stream(weights).sum();
        int maxweight=Arrays.stream(weights).max().getAsInt();
        int min=Arrays.stream(weights).sum();

        
        


        while (maxweight<=totalweight) {
            int mid= maxweight+(totalweight-maxweight)/2;
            if(isShippingPossible(weights, days, mid)){
                
                min=mid;
                totalweight=mid-1;


            }else{
                maxweight=mid+1;


            }
            
        }
            
        
return min;



        
    }
    public boolean  isShippingPossible(int weights[],int days,int day){
        int daycount=1;
        int curload=0;
        for (int i = 0; i < weights.length; i++) {
            if(curload+weights[i]>day) {
                daycount++;
                curload=0;
            
            }
            curload+=weights[i];



            
        }

        return daycount<=days;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,1,1};
        int days=4;
        System.out.println(new Solution().shipWithinDayss(arr, days));
    }
}