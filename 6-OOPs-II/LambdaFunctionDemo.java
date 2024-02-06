/* A Java program to demonstrate anonymous classes and Lambda expressions */

/* A Functional Interface is an interface with only a single method
 * using @FunctionalInterface annotation if we declare more than one method, java will throw compile time error
 */
@FunctionalInterface
interface AnFunctionalInterface {
    public void show(int numArg);
}


public class LambdaFunctionDemo {
    public static void main(String[] args){

        /* Creating a new object of the interface without creating an implemented class
           on spot implementation of the interface method */

           AnFunctionalInterface funcInterfaceObj = (numArg) -> {
            System.out.println("Show method called from an anonymous class ");
            System.out.println("Argument passed inside lambda function: " + numArg );
        };
            

        /* Since interface A has only one method it will directly implement the same method  */

        funcInterfaceObj.show(7);
        System.out.println(funcInterfaceObj instanceof AnFunctionalInterface); // true
        System.out.println(funcInterfaceObj.getClass()); // class LambdaFunctionDemo$$Lambda$1/0x00007f363c000c08
    }
}
