public class sq {
    public int nthroot(int N,int M){
        //N=3 M=27
    // but it takes tc of O(n)
        for (int i = 0; i < M; i++) {
               if(Math.pow(i,N)==M){
        return i;

       }
        }
    

        return -1;
    }

    public int nthrootbs(int N,int M){
        //N=3 M=27
        int low = 0;
        int high = M ;
        // edge case
        if (M < N)
            return M;
        while (low <= high) {
            int mid = low + (high - low) / 2;
           
            //long s=(long )Math.pow(mid,N);//
            long s=1;
            for (int i = 0; i <N; i++) {
                s=s*mid;
                if(s>M) break;
                
            }
        
            if (s == M)
                return mid;
            if (s <= M)
                low = mid + 1;
            else if (s >= M)
                high = mid - 1;

        }
       
        return -1;

        

    }

    public static void main(String[] args) {
        int N=2;
        int M=81;
        System.out.println(new sq().nthrootbs(N,M));
        
    }
    
}


