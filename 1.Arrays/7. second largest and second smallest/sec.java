public class sec {
   static void  secondslno(int[] nums){
        
        int first=Integer.MIN_VALUE;
        int second=Integer.MAX_VALUE;
        int firsts=Integer.MAX_VALUE;
        int seconds=Integer.MAX_VALUE;
        if (nums.length<2) {
            System.out.println("array size is to small");
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>first){
                second=first;
                first=nums[i];
            }
            else if(nums[i]>second&&nums[i]!=first){
                second=nums[i];

            }

             if(nums[i]<firsts){
                seconds=firsts;
                firsts=nums[i];
            }
            else if(nums[i]<seconds&&nums[i]!=firsts){
                seconds=nums[i];

            }
            
        }
        if(second==Integer.MIN_VALUE){
            System.out.println("no second largest");
        
        }else{
            System.out.println(" second largest:"+second);
            
        }
          if(seconds==Integer.MAX_VALUE){
            System.out.println("no second smallest");
        
        }else{
            System.out.println(" second smallest:"+seconds);
            
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,4,7,7,5};
        sec.secondslno(arr);
        
    }
}
