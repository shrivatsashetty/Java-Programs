/* Java program to demonstrate multiplication of two nxn matrices */

public class MatrixMultiplication {
    public static void main(String args[]){

        // lets consider two 3x3 matrices
        int[][] matrixA = { {1, 4, 5}, {2, 6, 7}, {0, 3, 2} };
        int[][] matrixB = { {4, 3, 2}, {1, 8, 0}, {2, 6, 3} };
        int[][] productMatrix = new int[matrixA.length][matrixB.length];

        for(int x = 0; x < productMatrix.length; x++ ){
            for(int y = 0; y < productMatrix.length; y++ ){
                for(int j = 0; j < productMatrix.length; j++ ){
                    System.out.println("x:" + x + " " + "y:" + y + " " + "j:" + j);
                    productMatrix[x][y] += matrixA[x][j] * matrixB[j][y];
                }
            }
        }
        System.out.println("The result of mutiplying the following matrices");
        for(int i = 0; i < productMatrix.length; i++){
            System.out.println("\n");
            for(int j = 0; j < productMatrix.length; j++){
                System.out.print(" "  + productMatrix[i][j]);
            }
        }
        System.out.println("\n");
        
    }
}
