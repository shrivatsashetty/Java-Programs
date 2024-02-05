

/* lets create a some interface */
interface InterfaceA{
    void show();
    void display();
}

public class InterWithAnonInnClass {

    public static void main(String[] args) {

        /* we can't create an object of the interfce
         * but we can create an object of the anonymous inner class of interface */
        InterfaceA objA = new InterfaceA() {

            // this anonymous inner class is now implementing the interface
            // and hence must provide implementation to all the methods of the interface 

            @Override
            public void show(){
                System.out.println("inside show method");
            }
            
            @Override
            public void display(){
                System.out.println("inside display method");
            }

        };

        // calling the methods
        objA.show(); 
        objA.display();

    }

}
