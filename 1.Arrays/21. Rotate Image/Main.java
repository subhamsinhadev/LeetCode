public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        Solution sol = new Solution();
        sol.rotate(matrix);

        System.out.println("\nRotated Matrix (90° Clockwise):");
        printMatrix(matrix);
    }

    // Helper method to print matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

class Solution {
    public void rotate(int[][] matrix) {
        //len of the row 
        int n = matrix.length;
        for (int i = 0; i < (n+1)/2; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[n-1-j][i];//top => top right
               matrix[n-1-j][i]=matrix[n-1-i][n-1-j]; //top right=> right bottom
               matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
               matrix[j][n-1-i]=temp;


                

                
            }
            
        }

    
    
    }
}
