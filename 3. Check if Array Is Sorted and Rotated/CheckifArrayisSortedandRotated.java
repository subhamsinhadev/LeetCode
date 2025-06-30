class CheckifArrayisSortedandRotated {
    public static boolean check(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                count++;
            }
    }
            if(arr[arr.length-1]>arr[0]){
                count++;

            }
            
        if ((count<=1)) {
            return true;
            
        }
        return false;

    }
    
    public static void main(String[] args) {
        int[] arr={50,40,10,20,30};
       System.out.println( CheckifArrayisSortedandRotated.check(arr));

    
    }
}
