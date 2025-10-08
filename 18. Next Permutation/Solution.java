import java.util.ArrayList;

public class Solution {
    public static void nextPermutation(int[] nums) {
        int pivot=-1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] < nums[i+1]){
                pivot=i;
            }
        }
        if(pivot==-1){
            reverse(nums,0,nums.length-1);
            return;
        }

        for(int i=nums.length-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                swap(nums,pivot,i);
                break;
            }
        }
        reverse(nums,pivot+1,nums.length-1);
    }

    private static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    private static void swap(int arr[],int pos1,int pos2){
        int temp=arr[pos1];
        arr[pos1]=arr[pos2];
        arr[pos2]=temp;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        
        nextPermutation(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
    }
}
