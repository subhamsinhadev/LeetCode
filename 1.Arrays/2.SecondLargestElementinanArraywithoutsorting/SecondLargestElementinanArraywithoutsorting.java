
public class SecondLargestElementinanArraywithoutsorting {
    public static int getSecondLargest(int[] arr){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
       //checking for if arr size is two;
        if(arr.length<2){
            return -1;
        }
        //loop through array
        for(int i=0;i<arr.length;i++){
            //if i is greater than first then second =first aur first=i
            if(arr[i]>first){
                second=first;
                first=arr[i];

            }
            //agar nhi h toh second=i
            else if(arr[i]>second&&arr[i]   !=second){
                second=arr[i];

            }
        

        }
        //agar dono elements same ho jaye
        if(second==Integer.MIN_VALUE){
            return -1;

        }
        return second;
    }
    public static void main(String[] args) {
        int  arr[]={12, 35, 1, 10, 34, 1};
        int num=SecondLargestElementinanArraywithoutsorting.getSecondLargest(arr);
        System.out.println("SecondLargestElementinanArraywithoutsorting:"+num);
    }
}
