
/* java collection APIs are built to work with objects and not primitive data type */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FirstCollection {
    public static void main(String[] args) {
        /* two ways to instantiate a list */

        // now we connot acess the get() method since it belongs to interface Collection
        Collection<Integer> numsOdd = new ArrayList<Integer>();

        numsOdd.add(1);
        numsOdd.add(3);
        numsOdd.add(5);

        System.out.println(numsOdd); // printing them all at once

        // printing one by one using enhanced for loop
        for( Integer n : numsOdd){
            System.out.println(n);
        }

        // now we can acess the get() method since it belongs to class List
        List<Integer> numsEven = new ArrayList<Integer>();

        // adding elements
        numsEven.add(2);
        numsEven.add(4);
        numsEven.add(6);

        System.out.println(numsEven.get(0));
        System.out.println(numsEven.get(1));
        System.out.println(numsEven.get(2));

        System.out.println(numsEven.indexOf(2));

    }
}
