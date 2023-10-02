/* In java an array is an object that holds fixed no of values of certain data type  */

class ArrayDemo{
    public static void main(String[] args){

        // an array of type 'int' declared
        int[] myArray;  

        /* allocatioin of memory for 5 integers since array is an object
           we have to create a new instance of array using 'new' key word */
        myArray = new int[5];

        // initialising the elements
        myArray[0] = 12;
        myArray[1] = 13;
        myArray[2] = 2;
        myArray[3] = 7;
        myArray[4] = 2;
 
        for(int i = 1; i<=5; i++){
            System.out.println("Element at index " + (i-1) + " is " + myArray[i-1]);
        }
        //  int[] anArray = new int[3];
        //  anArray = {1,2,3,};
        //  System.out.println(anArray[2]);

         int[] someArray = {10,9,6,5,4,3,2,1};
         System.out.println("Element at index 1 :" + someArray[1]);



    }
}