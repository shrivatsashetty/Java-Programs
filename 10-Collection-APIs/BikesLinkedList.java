import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;



public class BikesLinkedList {
    public static void main(String[] args){
        System.out.println("\nOutput:\n");

        /* First we will create an immutable list conataining names of some bike companies  using List.of() method */
        List<String> bikeNames = new ArrayList<>(); 
        bikeNames.add("Honda");
        bikeNames.add("Suzuki");
        bikeNames.add("Hero");

        /* Now pass the created list as input (argument) to the constructor of LinkedList class */
        LinkedList<String> bikes = new LinkedList<>(bikeNames);     

        // checking if the indexing works
        System.out.println("\nElement @ index 1: " + bikes.get(1));

        /* addFirst() method */
        bikes.addFirst("Hero");
        System.out.println("\nAfter addFirst(Hero) the list:\n " + bikes);

        bikes.addLast("Kawasaki");
        System.out.println("\nAfter adding Kawasaki at last:\n " + bikes);

        bikes.removeLast();
        System.out.println("\nremoveLast() :\n " + bikes);

        bikes.removeFirst();
        System.out.println("\nremoveFirst():\n " + bikes);

        System.out.println("\ngetFirst(): \n " + bikes.getFirst());
        System.out.println("\ngetLast(): \n " + bikes.getLast());

        // add() method 
        bikes.add("Yamaha");
        System.out.println("\nadd(Yamaha)\n " + bikes);

        // set() method
        System.out.println("\nbike replaced: " + bikes.set((int)bikes.size()/2, "Harley"));
        System.out.println(bikes);
 

    }

}
