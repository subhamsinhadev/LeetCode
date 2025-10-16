import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        if(numRows==0) return result;
        result.add(new ArrayList<>(Arrays.asList(1)));
        
        if(numRows==1)return result;
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevNum=result.get(i-1);
            ArrayList<Integer> row=new ArrayList<>();
            row.add(1);
            for (int j = 0; j < i-1; j++) {
                row.add(prevNum.get(j)+prevNum.get(j+1));
                
            }
            row.add(1);
            result.add(row);
            
        }
        return result;

    }
    public static void main(String[] args) {
        List<List<Integer>> result=new PascalTriangle().generate(5);
        System.out.println(result); 
        
    }
}