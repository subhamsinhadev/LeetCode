public class linear

    
{

public static void main(String[] args) {
    int arr[]={10,20,30,40};
   System.out.println( linearSearch(arr, 30));


    
    
}
public static int linearSearch(int[] array,int target){
    for (int i = 0; i < array.length; i++) {
        if(array[i]==target){
            return i;
        }
        
    }
return -1;

}
}