import java.util.HashSet;

public class AgesHashSet {
    public static void main(String[] ags){

        System.out.println("\nOutput:\n");
        HashSet<Integer> ages = new HashSet<>();

        ages.add(12);
        ages.add(12); //adding a duplicate age
        ages.add(5);
        ages.add(8);
        ages.add(15);
        ages.add(8); // duplicate

        System.out.println("Unique age in the list:\n " + ages);

        

    }
}
