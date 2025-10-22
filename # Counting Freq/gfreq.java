import java.util.HashMap;
import java.util.Set;

public class gfreq{
    public static int freqcalc(int nums[],int n){
         HashMap<Integer,Integer> freq=new HashMap<>();
//here we calc freq of each element
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num,0)+1);

        }
        int count=freq.get(n);//here we get freq of each element
        int sum=0;
        for (int s : freq.keySet()) {
            if(freq.get(s)%n==0){
                sum+=s*freq.get(s);


            }
            
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,1,2};
        System.out.println(freqcalc(arr, 2));
    }
}