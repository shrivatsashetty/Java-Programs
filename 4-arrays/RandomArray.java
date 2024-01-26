/* sample java program to create an array of random numbers */
import java.lang.Math;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the dimension of the array:");
        int dimension = scanner.nextInt();

        System.out.println("Here's your randomly generaed " + dimension + "X" + dimension + " array");
        int[][] randomMatrix = new int[dimension][dimension]; 

        // we randomly populate the matrix using Math.random() function
        for(int i = 0; i < dimension; i++){
            for(int j = 0; j < dimension; j++){
                randomMatrix[i][j] = (int)(Math.random() * 100);
            }
        }

        // using enhanced for loop to iterate over matrix
        for(int[] innerArray : randomMatrix){
            for(int element : innerArray){
                System.out.print(element + " ");
            }
            System.out.println(); // to print a newline character after every iteration
        }

        scanner.close();
    }
}
