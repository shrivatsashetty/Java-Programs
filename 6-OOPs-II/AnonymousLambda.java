/* A Java program to demonstrate anonymous classes and Lambda expressions */

/* A Functional Interface is an interface with only a single method */
@FunctionalInterface
interface A {
    public void show();
}


public class AnonymousLambda {
    public static void main(String[] args){

        /* Creating a new object of the interface without creating an implemented class
           on spot implementation of the interface method */

        A a = () -> {
            System.out.println("Show method called ");
            System.out.println("From an anonymous class ");
        };
            

        /* Since interface A has only one method it will directly implement the same method  */

        a.show();
    }
}
