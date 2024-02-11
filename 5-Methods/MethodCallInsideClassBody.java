
/* this java program demonstrates how we can call the methods of a class inside the body of the class
 * without creating an object of the class and using Initialization block */

class Multipler {

    public int twoTimes(int OrignalValue) {
        return 2 * OrignalValue;
    }


    public int fourTimes(int orignalValue) {
        return 2 * twoTimes(orignalValue);
    }

    public void printClassDescription(){
        System.out.println("this class has methods to double and quadruple given values ");
    }

    // we can call the method belonging to the class within it's own body without the use of object of the class
    // for this one way is to make use of an initialisation block
    // the code in this block is called every time a class in instantiated
    { 
        fourTimes(2); // will not print anything to std out
        printClassDescription();
    }

    int doubledValue = twoTimes(3);
}

public class MethodCallInsideClassBody {
    public static void main(String[] args) {

        Multipler multipler = new Multipler();

        System.out.println(multipler.fourTimes(3)); // 12
        System.out.println(multipler); // Multipler@7344699f
        System.out.println(multipler.doubledValue);
    }
}
