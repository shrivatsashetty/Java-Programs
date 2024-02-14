
/* a java program to extract units digit from each numbers in a given array of integers */

public class UnitsDigitExtract {

    public static void main(String[] args) {
        int[] givenArray = {43, 31, 72, 29};

        // since arrays are objects we use new keyword to initailise an array
        int[] solutionArray = new int[givenArray.length];

        // System.out.println(333 - 10*(333/10)); // 330

        for(int i = 0; i < givenArray.length; i++){
            solutionArray[i] = givenArray[i] % 10;
        }

        for(int n : solutionArray){
            System.out.print(n + " ");
        }

        System.out.println();
    }
}
