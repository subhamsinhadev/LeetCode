import java.util.Arrays;

public class Solution {

    public int tEatingHours(int piles[], int hour) {
        int ciel = 0;
        for (int i = 0; i < piles.length; i++) {

            ciel += (int) Math.ceil((double) piles[i] / hour);

        }
        return ciel;
    }

    public int minEatingSpeeds(int[] piles, int h) {
        int maxVal = Arrays.stream(piles).max().getAsInt();

        for (int i = 1; i <= maxVal; i++) {
            int hours = tEatingHours(piles, i);
            if (hours <= h) {
                return i;
            }

        }

        return maxVal;

    }

    public int minEatingSpeed(int[] piles, int h) {
        int low=1;//kyunki koko 0hr nhi kha sakta hai
        int high=0;

        for (int i : piles) {
            high=Math.max(high, i);
            
        }
        while (low<high) {
            int mid=low+(high-low)/2;
            if(tEatingHours(piles, mid)<=h) high=mid;
            else low=mid+1;
            
        }

        return low;


    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 7, 11 };
        System.out.println(new Solution().minEatingSpeed(arr, 8));
    }
}