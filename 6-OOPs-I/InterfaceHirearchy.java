
/** a java pro
 *  
 */

interface SimpleInterface {
    
    final static int num = 7;

    public abstract void displayNum();

    // by default acess modifier is public and absract, so no need to specify explicitly
    void sayHi();
}

// an abstract class can extend an interface
abstract class SimpleAbstractClass implements SimpleInterface{
    @Override 
    public void sayHi(){
        System.out.println("Hi from abstract class which implemented the interface");
    }

    // an abstract class may choose not to implement an abstract method of the interface
    public abstract void displayNum();
}

// simple ordinary class
class SimpleOrdinaryClass extends SimpleAbstractClass{
    // an ordinary class must compulsorily provide implementation for all inherited abstract methods
    @Override
    public void displayNum(){
        System.out.println("Acessing value of instance variable from interface: " + SimpleInterface.num);
        System.out.println("Acessing value of instance variable from Abstract class: " + SimpleAbstractClass.num);
    }
}

public class InterfaceHirearchy {
    public static void main(String[] args) {
        
        System.out.println();

        SimpleOrdinaryClass simpleObject = new SimpleOrdinaryClass();
        simpleObject.sayHi();
        simpleObject.displayNum();
    }
}
