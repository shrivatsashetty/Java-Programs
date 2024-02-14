import java.util.ArrayList; // util is a package
import java.util.List;     // List is an interface inside the util package
import java.util.Random;
import java.util.Collections; 

public class NumberList {

    public static void main(String[] args){

        /* instantiating an ArrayList at the time of creation itself */
        List<Integer> myNums = new ArrayList<>();
        myNums.add(7);
        myNums.add(5);
        myNums.add(3);
        // System.out.println(myNums);
        myNums.add(9); // its mutable
        System.out.println("myNums before sort:\n " + myNums);
        // myNums.sort(null);
        Collections.sort(myNums);
        System.out.println("myNums after sort:\n " + myNums);
        

        /* Creating an ArrayList conatinig random integers using Random class */
        List<Integer> randomNums = new ArrayList<>();
        Random randomValueGenerator = new Random();// an object to generate random values

        // filling the array list with random numbers from 1 to 25
        for(int i = 1; i <= 10; i++){
            randomNums.add(randomValueGenerator.nextInt(25));
        }

        System.out.println("List of random numbers: " + randomNums);
        


    }
    
}
