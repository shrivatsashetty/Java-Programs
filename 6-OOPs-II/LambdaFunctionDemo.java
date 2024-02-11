/* A Java program to demonstrate anonymous classes and Lambda expressions */

/* A Functional Interface is an interface with only a single method
 * using @FunctionalInterface annotation if we declare more than one method, java will throw compile time error
 */
@FunctionalInterface
interface AFunctionalInterface {
    public void show(int numArg);
    // public void display();
}


public class LambdaFunctionDemo {
    public static void main(String[] args){

        /* Creating a new object of the interface without creating an implemented class
           on spot implementation of the interface method */

           AFunctionalInterface funcInterfaceObj = (numArg) -> {
            System.out.println("Show method called from an anonymous class ");
            System.out.println("Argument passed inside lambda function: " + numArg );
        };
            

        /* Since interface A has only one method it will directly implement the same method  */

        funcInterfaceObj.show(7);
        // lets see if the object is an instance of the interface, 
        System.out.println(funcInterfaceObj instanceof AFunctionalInterface); // true
        // check the class of the object
        System.out.println(funcInterfaceObj.getClass()); // class LambdaFunctionDemo$$Lambda$1/0x00007f363c000c08
    }
}
