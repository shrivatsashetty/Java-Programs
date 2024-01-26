public class MatrixAddition {
    public static void main(String args[]){
        // lets consider two 3x3 matrices
        int[][] matrixA = { {1, 4, 5}, {2, 6, 7}, {0, 3, 2} };
        int[][] matrixB = { {4, 3, 2}, {1, 8, 0}, {2, 6, 3} };

        // we add the matrices only if the dimensions are equal
        if(matrixA.length == matrixB.length){
            // create a third matrix to store the result
            int[][] resultMatrix = new int[ matrixA.length ][ matrixB.length ];

            for(int i = 0; i < resultMatrix.length; i++){
                for(int j = 0; j < resultMatrix.length; j++){
                    resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }

            System.out.println("The result of adding the following matrices");
            for(int i = 0; i < resultMatrix.length; i++){
                System.out.println("\n");
                for(int j = 0; j < resultMatrix.length; j++){
                    System.out.print(" "  + resultMatrix[i][j]);
                }
            }
            System.out.println("\n");

        }
        else{
            System.out.println("Cannot add matrices, Unequal dimensions");
        }                    
    }
}
