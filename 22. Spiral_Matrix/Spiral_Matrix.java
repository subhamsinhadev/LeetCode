import java.util.*;

public class Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();

        if (matrix == null && matrix.length == 0) {
            return arr;
        }
        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // traverse right
            for (int j = colBegin; j <= colEnd; j++) {
                arr.add(matrix[rowBegin][j]);

            }
            rowBegin++;

            // traverse bottom

            for (int i = rowBegin; i <= rowEnd; i++) {
                arr.add(matrix[i][colEnd]);
            }
            colEnd--;
            // traverse left now
            if (rowBegin <= rowEnd) {
                for (int j = colEnd; j >= colBegin; j--) {
                    arr.add(matrix[rowEnd][j]);

                }
                rowEnd--;

            }
            // at last travel top
            if (colBegin <= colEnd) {
                for (int j = rowEnd; j >= rowBegin; j--) {
                    arr.add(matrix[j][colBegin]);

                }
                colBegin++;

            }

        }

        return arr;
    }

    public static void main(String[] args) {
        Spiral_Matrix sm = new Spiral_Matrix();
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println(sm.spiralOrder(matrix));
    }
}
