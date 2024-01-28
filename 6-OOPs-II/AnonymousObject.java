/* An anonymous object are not assigned a name
   and can only be used once  */

/* since we already have a class called Anonymous in the same package(folder) 
    we'll use other name for this class*/

class AnonymousSecond {

        String name = "Anonymous ";
        
        /* constructor */ 
        AnonymousSecond() {
            System.out.println("\nObject of AnonymousObject class created");
        }

        // user defined method
        public void sayName(){
            System.out.println("I am an " + name + "class");
        }
    }

public class AnonymousObject {
    public static void main(String[] args) {

        // create an object of the above class but we do not store it in a variable i.e don't give it a name

        new AnonymousSecond(); // only the constructor will be called

        new AnonymousSecond().sayName(); // both constructor and user defined method is called
    }
}


