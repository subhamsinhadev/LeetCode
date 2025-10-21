import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {

        //testcase
        if(intervals.length<=1) return intervals;

        // sorting the intervals in asc order
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];
        result.add(newInterval);

        
        for (int[] interval:intervals) {
            //cond for overlap check Agar current interval ka
            //  start ≤ previous (newInterval) ka endtoh iska matlab overlap hua hai.
            if (interval[0] <= newInterval[1]) {
                newInterval[1]=Math.max(newInterval[1], interval[1]);

            }else{
                newInterval=interval;
                result.add(newInterval);
            }

        }

        return result.toArray(new int[result.size()][]);

    }

    public static void main(String[] args) {
        int intervals[][] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int s[][] = new Solution().merge(intervals);
        System.out.println(Arrays.deepToString(s));

        //multi-dimensional arrays (2D, 3D...) ke liye perfect h deepToString
    }
}