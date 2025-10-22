import java.util.HashMap;
import java.util.Map;

public class lonseq {
    public int lonseqcons(int nums[]){
        int maxlen=0;
        Map<Integer,Boolean> exmap=new HashMap<>();
        if(nums.length==0)return 0;

        for (int i : nums) {
            exmap.put(i, Boolean.FALSE);
        }

        for (int num : nums) {
            int currentlen=1;
            int nextNum=num+1;
            while (exmap.containsKey(nextNum)&&exmap.get(nextNum)==false) {
                currentlen++;
                exmap.put(num,Boolean.TRUE);
                nextNum++;
            }
            int prevNum=num-1;
            while (exmap.containsKey(prevNum)&&!exmap.get(prevNum)) {
                currentlen++;
                exmap.put(num, Boolean.TRUE);
                prevNum--;    
            }
            maxlen=Math.max(currentlen, maxlen);

        }




        return maxlen;
    }
    public static void main(String[] args) {
        int arr[]={0,3,7,2,5,8,4,6,0,1};
        System.out.println("Longest Consecutive Sequence: "+new lonseq().lonseqcons(arr));
    }
}
