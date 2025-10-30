public class Sol {
    public int minElement(int nums[]){
        int index=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<index){
                index=nums[i];
            }

                
            
    
        

        
            
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2,3};
        System.out.println(new Sol().minElement(arr));

    }
    
}
