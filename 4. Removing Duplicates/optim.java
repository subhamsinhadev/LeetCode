public class optim {
     class removepdu {
        static int rem(int[] arr){
            int i=0;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j]!=arr[i]) {
                    // println(arr[i+1]);
                    // println(arr[j]);
                    arr[i+1]=arr[j];
                    i++;
                    
                }

                
            }
            // System.out.println(i+1);
            return i+1;
        }
    
        
    }
    public static void main(String[] args) {
        int[] arr={10,10,20,30,40,50}; 
        int k=removepdu.rem(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
    
}
