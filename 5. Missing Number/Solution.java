public class Solution {

    public  static int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length; // total numbers should be from 0 to n

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int totalSum = (n * (n + 1)) / 2;

        return totalSum - sum;
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,5}; 
         

        System.out.println(missingNumber(arr));
    }
}