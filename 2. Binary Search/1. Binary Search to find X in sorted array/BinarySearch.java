import java.util.*;

public class BinarySearch {
    public int binarySearch(int nums[],int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
        int mid=(low+high)/2;

            if(nums[mid]==target){
                return mid;

            }
             if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;

            }


        }


        return -1;

    }
    public static void main(String[] args) {
        // int arr[]={1,3,5,6};
        // System.out.println(new BinarySearch().binarySearch(arr, 5)+"\n"); 

        //using java collections framework
                // List<Integer> arrss = Arrays.asList();
                        List<Integer> arr = Arrays.asList(10, 20, 30, 40, 50);


     int  s= Collections.binarySearch(arr,30);
     System.out.println(s);
    }
    
}
