class Rotate{

    public static void rotatearrayByOne(int nums[],int n,int shift){
       //creates a temporary int array
        int temparr[]=new int[n];
        //shift each element by 1.
        for(int i=0;i<n;i++){
            temparr[i] = nums[(i + shift) % n];

        }
        //at last here last element is set to nums[0]
        // temparr[n-shift]=nums[0];
        //printing the array
        for(int i=0;i<n;i++){
            System.out.println(temparr[i]+" ");

        }
    }
}
public class rotatearray_by_n {
    public static void main(String[] args) {
        try {
                    int arr[]={15,25,35,45};
        Rotate.rotatearrayByOne(arr,arr.length,2);
        } catch (ArrayIndexOutOfBoundsException e) {
        
            System.out.println("Index Error");
        }

    }
    
}
