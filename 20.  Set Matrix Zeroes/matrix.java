public class matrix {

    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] zeroRow = new boolean[m];
        boolean[] zeroCol = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zeroRow[i] = true;
                    zeroCol[j] = true;

                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (zeroRow[i] || zeroCol[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

          System.out.println("Matrix after setting zeroes:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 0, 1 }, { 1, 0, 1 }, { 1, 1, 0 } };
        new matrix().setZeroes(arr);
    //     // System.out.println(arr[2][1]);
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 0; j < arr[i].length; j++) {
    //             System.out.println(i + " " + j);

    //         }
    //     }
    }

}
