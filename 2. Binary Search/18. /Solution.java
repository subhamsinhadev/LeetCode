import java.util.Arrays;

public class Solution {
    public int minDayss(int[] bloomDay, int m, int k) {
       
        int max = Arrays.stream(bloomDay).max().getAsInt();
        int min = Arrays.stream(bloomDay).min().getAsInt();
        for (int i = min; i < max; i++) {
            if(isPossible(bloomDay,i,m,k)==true) return i;
            
        }
        return -1;

    }

     public int minDays(int[] bloomDay, int m, int k) {
        int ans=-1;
        int max = Arrays.stream(bloomDay).max().getAsInt();
        int min = Arrays.stream(bloomDay).min().getAsInt();
        while(min<=max){
            int mid=min+(max-min)/2;
            if(isPossible(bloomDay,mid,m,k)){
                ans=mid;
                max=mid-1;
            }else{
                min=mid+1;

            }
        }
       return ans;

    }
    public boolean isPossible(int arr[],int day,int m ,int k){
         int cnt = 0;
        int NofB = 0;
       
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <=day) {
                cnt++;

            } else{
              NofB+=(cnt / k);
              cnt=0;

        }}
                      NofB+=(cnt / k);

        if (NofB >= m)
            return true;



    else return false;
    }

    public static void main(String[] args) {
        int[] bloomDay = { 1, 10, 3, 10, 2 };
        int m = 3;
        int k = 2;
        System.out.println(new Solution().minDays(bloomDay, m, k));
    }
}
