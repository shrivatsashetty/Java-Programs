
/* a java program to demonstrate wilcard generics */

import java.util.List;
import java.util.ArrayList;


public class WildCardGeneric {

    // a static method apart from the main
    public static void printList(List < ? > elementOfSomeType){ // if we append "extends Pet" after "?" we get error
        System.out.println(elementOfSomeType);
        System.out.println(elementOfSomeType.getClass().getName());
    }

    // this is the main method
    public static void main(String[] args) {

        // create a list of Integers
        List<Integer> intList = new ArrayList<>();
        intList.add(0);
        intList.add(5);
        intList.add(8);
        printList(intList);
        // output
        /*  [0, 5, 8]
            java.util.ArrayList */


        // create a list of pet dogs, we have defined PetDog class in the same folder and hence can acess it
        List<Pet> petDogList = new ArrayList<>();
        // create two new instances of PetDog class
        PetDog germanShepherd = new PetDog("German Shepherd", "Woof..");
        PetDog bullDog = new PetDog("Bull Dog", "Aawgh..");

        petDogList.add(germanShepherd);
        petDogList.add(bullDog);
        printList(petDogList);
        // output
        /*  [PetDog@7344699f, PetDog@6b95977]
            java.util.ArrayList */
    }

}
