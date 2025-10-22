import java.util.HashMap;

public class BSubarray_Sum_Equals_K {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        hm.put(0, 1);
        int prefixSum=0;
        int result=0;
        for (int num : nums) {
            prefixSum+=num;
            if(hm.containsKey(prefixSum-k)){
                result+=hm.get(prefixSum-k);

            }
            hm.put(prefixSum,hm.getOrDefault(prefixSum, 0)+1);
            
        }
       

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 2, 1 };
        System.out.println(Subarray_Sum_Equals_K.subarraySum(arr, 3));

    }
}