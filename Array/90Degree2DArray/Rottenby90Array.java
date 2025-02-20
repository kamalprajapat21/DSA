import java.util.*;
 class Rottenby90Array{

    public static void rottation(int [][]matrix){
        int n = matrix.length;

        /*transporse */
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }


        /*Rottation */
    for(int i = 0;i<n;i++){
        for(int j =0;j<n/2;j++){
            int t = matrix[i][j];
            matrix[i][j] = matrix[i][n-j-1];
            matrix[i][n-j-1] = t;
        }
    }

    for (int row = 0; row < n; row++) {
        System.out.println(Arrays.toString(matrix[row]));
    }
    }
    public static void main(String[]args){
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rottation(matrix);




    }
}