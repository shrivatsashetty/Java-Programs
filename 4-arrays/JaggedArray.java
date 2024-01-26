/* A jagged array is a multidimensional array 
 * which may not have all equal number of elements in each internal array 
*/

import java.util.Random;

public class JaggedArray {
    public static void main(String[] args){
        /* lets instantiate a 2D array 
            but we will not specify the no of elements in each inner array
        */ 
        int[][] myJaggedArray = new int[3][];

        Random randNumGen = new Random();

        // myJaggedArray[0] = new int[3];
        // myJaggedArray[1] = new int[4];
        // myJaggedArray[2] = new int[2];

        // we can simplify the above using a for loop
        for(int i = 0; i < myJaggedArray.length; i++){
            myJaggedArray[i] = new int[randNumGen.nextInt(5)];
        }

        // lets check the column size for every row
        for(int i = 0; i < myJaggedArray.length; i++){
            System.out.println("Row " + i + " has " + myJaggedArray[i].length + " elements");
        }
    }
}
