class Rotate{

    public static void rotatearrayByOne(int nums[],int n){
       //creates a temporary int array
        int temparr[]=new int[n];
        //shift each element by 1.
        for(int i=1;i<n;i++){

            temparr[i-1]=nums[i];

        }
        //at last here last element is set to nums[0]
        temparr[n-1]=nums[0];
        //printing the array
        for(int i=0;i<n;i++){
            System.out.println(temparr[i]+" ");

        }
    }
}
public class rotatearray {
    public static void main(String[] args) {
        try {
                    int arr[]={15,25,35,45};
        Rotate.rotatearrayByOne(arr,arr.length);
        } catch (ArrayIndexOutOfBoundsException e) {
        
            System.out.println("Index Error");
        }

    }
    
}
