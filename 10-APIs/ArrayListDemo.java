import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo{
    public static void main(String[] args){
        System.out.println("\n");

        /* Creating an instance of ArrayList we make refernce to Parent class and create an object of child class
         * An ArrayList is dynamic in size
         */
        List<String> names = new ArrayList<>();

        names.add("Pratheek");
        names.add("Shri");
        names.add("Prajwal");

        // Acessing the elements
        System.out.println("These are the names: " + names);
        System.out.println("Name @ Index 2: " +  names.get(2)); // will return the name at index 2

        List<Integer> ages = new ArrayList<Integer>();

        ages.add(24);
        ages.add(21);
        ages.add(20);
        
        System.out.println("These are the ages: " + ages);
        System.out.println("Age @ second position: " + ages.get(2 - 1));


        // comibinig the result of both the ArrayList
        System.out.println(names.get(0) + " is " + ages.get(0) + " years old." );

        // Using for each method to iterate over the array elements
        System.out.println("Name List:");
        for(String name : names){
            System.out.println(name);
        }
        


        System.out.println("After incrementing by one year the ages are as follows:\n" + ages);

        // check if the list is empty
        if(ages.isEmpty() /* returns a bolean */ ){
            System.out.println("Is the age list empty: ");
        }else{
            System.out.println("Age list is not empty");

        }

       


    }
}