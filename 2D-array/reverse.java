import java.util.*;
public class reverse{

    public static int[][] letsReverse(int[][] mymatrix){
        int row = mymatrix.length;
        int col = mymatrix[0].length;
        int[][] reverseMatrix = new int[row][col];
        for(int i = 0; i<row;i++){
            for(int j = 0; j<col;j++){
                reverseMatrix[i][j] = mymatrix[row  - i - 1][col - j -1];
            }
        }

        return reverseMatrix;
    }

    public static void printmatrix(int[][] matrix){
        for(int i=0; i < matrix.length; i++){
            for(int j =0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        
        //System.out.println();
        printmatrix(matrix);
        int[][] finalMatrix = letsReverse(matrix);
        System.out.println("=============================================");
        printmatrix(finalMatrix);
    }
}