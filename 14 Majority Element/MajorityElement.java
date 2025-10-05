import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int n2=nums.length/2;

        int element=1;
        Map<Integer,Integer> freq=new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            freq.put(i, freq.getOrDefault(freq, 0)+1);
            
        }

        for (int i = 0; i < nums.length; i++) {
            
        }

    

        
      


        
        

    return element;
    }
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println("maj:"+majorityElement(nums));

    }
}
