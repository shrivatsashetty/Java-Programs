
/*  */


// imports
import java.util.List;
// import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


class GenericSorter< T extends Comparable<T> >{
    public List<T> sortList(List<T> list){
        Collections.sort(list);
        return list;
    }
}

public class SortingClassDemo{
    GenericSorter<Integer> genericSorter = new GenericSorter<>();

    List<Integer> listOfIntegers = Arrays.asList(3, 5, 4);
    List<String> listOfStrings = Arrays.asList("D", "C", "A");
    List<Double> listOfDoubles = Arrays.asList(2.5, 1.6, 1.1);

    List<Integer> sortedListOfIntegers = genericSorter.sortList(listOfIntegers);
    List<Integer> sortedListOfDoubles = genericSorter.sortList(listOfIntegers);
    
}