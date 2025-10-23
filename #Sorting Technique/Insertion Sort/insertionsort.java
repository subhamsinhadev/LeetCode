public class insertionsort {
    void sort(int[] arr){
        int n=arr.length;
        for (int i = 1; i < arr.length; i++) {
        int key=arr[i];
        int j=i-1;
        while(j>=0&&arr[j]>key){
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=key;
            
        }
    }

    public static void main(String[] args) {
        int arr[]={10,30,60,20};
        new insertionsort().sort(arr);
        for (int i : arr) {
            System.out.println(i+" ");
            
        }
    }
}