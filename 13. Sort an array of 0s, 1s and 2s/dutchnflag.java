public class dutchnflag {

     public static void sortColors(int[] nums) {
        int n=nums.length;
        int start=0;
        int mid=0;
        int end=n-1;
        while(mid<=end){
            switch (nums[mid]) {
                case 0:
                    swap(nums,start,mid);
                    start++;
                    mid++;
                    
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums,mid,end);
                    end--;
                    break;
            }
        }

     }
     private static void swap(int nums[],int pos1,int pos2){
        int temp=nums[pos1];
        nums[pos1]=nums[pos2];
        nums[pos2]=temp;

     }
public static void main(String[] args) {
    int arr[]={2,0,2,1,1,0,1,0,1,0};
    sortColors(arr);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+"");
        
    }
    
}
}
