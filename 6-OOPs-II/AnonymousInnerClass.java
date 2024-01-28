/* In this program we create a simple class and an anonymous inner class */
abstract class Anonymous{
    // simple method
    public abstract void show();
}

public class AnonymousInnerClass {
    public static void main(String[] args){

        /* overriding one of the methods of the class during instantiation
            note that even though we canot create an object of abstract class
            but here we are creating an object of anonymous inner class 
        */ 
        Anonymous anonymous = new Anonymous(){
            @Override
            public void show(){
                System.out.println("\nProviding implementation for abstract method by overriding");
            }
        };

        anonymous.show();
    }
    
}


