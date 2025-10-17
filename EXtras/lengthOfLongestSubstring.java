import java.util.HashMap;

public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm=new HashMap<>();
        int maxLen=0;
        int start=0;
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(hm.containsKey(c)&&hm.get(c)>=start){
                start=hm.get(c)+1;
            }
            hm.put(c,i);
            maxLen=Math.max(maxLen,i-start+1);


            
        }
        return maxLen;
    
        
        
    }
    public static void main(String[] args) {
        String s="bbbbbb";
        System.out.println(new lengthOfLongestSubstring().lengthOfLongestSubstring(s));
    }
}