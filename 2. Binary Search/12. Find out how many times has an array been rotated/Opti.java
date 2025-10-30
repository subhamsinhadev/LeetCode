public class Opti {
    public int noOfRotations(int nums[]){
        int low=0;
        int high=nums.length-1;
        int n=nums.length;
        int min=0;

        while (low<=high) {
            int mid=low+(high-low);
            int next=nums[mid+1]%n;
            int prev=nums[mid+n-1]%n;


            if(nums[mid]<=nums[next]&&nums[mid]<=nums[prev]){
                min=mid;
            
                return mid;
            }
            if(nums[low]<=nums[mid]){
                low=mid+1;
        }
            else if(nums[mid]<=nums[high]){
                high=mid-1;


            }
            
        }

        
        return min;
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,0,1,2,3,4};
        System.out.println(new Solu().noOfRotations(arr));

    }
    
}
