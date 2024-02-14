import java.util.ArrayList;
import java.util.List;
// import java.util.Collection;
// import java.util.Collections;

public class ArrayListTrail {
    
    public static void main(String[] args){

        System.out.println("\nOutput:\n"); // for extra spacing

        List<String> cars = new ArrayList<String>(); 
        
        String[] carNames = {"Audi", "Benz","BMW", "Jaguar"}; // An array of String to store car names 

        // Adding all the names using for-each loop or the enhanced for loop
        for(String name : carNames){
            cars.add(name);
        }
        /* In the above for-each loop the iterator variable
           'name'  is a temporary variable that is created 
            and it's data type has to  mentioned */

        System.out.println(cars); // printing the ArrayList at once
        System.out.println("The cars in the list are:");
        for(String car : cars){
            System.out.println(car);
        }

        // get() method to acess the element
        System.out.println("First car in the list is: " + cars.get(0));

        // set() method, takes an index and element as an argument
        cars.set(0, "Omini");
        System.out.println("After using set() method\nthe first car: " + cars.get(0));

        // size() method
        System.out.println("no of car name in the list: " + cars.size());

        // Midlle element 
        int middleIndex = (int)cars.size()/2; // casting to integer
        System.out.println("Middle index: " + middleIndex);
        System.out.println("middle element: " + cars.get(middleIndex));

        // remove() method
        cars.remove(2); 
        System.out.println("new list after removing mid element: " + cars);

        System.out.println("After removing last element the list ");
        String removedCarName = cars.remove(cars.size() -1);
        System.out.println("Removed car name: " + removedCarName);
        // cars.remove(cars.size() -1);
        System.out.println("New car list" + cars);

        System.out.println(" After clearing the list ");
        cars.clear(); // cleans the list
        System.out.println("The car list: " + cars);



    }
}
