/* a program to demonstrate loose coupling and dynamic method dispatch */


interface Computer{
    /* in order for the computer to develop it takes a developer 
       every method in an interface is public abstract by default, so we need not mention it seperately */ 

    void develop(Developer developer);
}

class Laptop implements Computer{

    public void develop(Developer developer){
        System.out.println(developer.developerName + " is Coding in Laptop");
    }

} 

class Desktop implements Computer{
    public void develop(Developer developer){
        System.out.println(developer.developerName + " is Coding Faster in Desktop");
    }
}

// developer is dependent on Computer for coding
class Developer{

    String developerName;

    // constructor
    Developer(String developerName){
        this.developerName = developerName;
    }

    // the below method can take any subclass of the Computer as argument, providing flexibility 
    public void code(Computer computer){
        computer.develop(new Developer(this.developerName));
    }
}

public class LooseCoupling {
    public static void main(String[] args){
        // below we create two objects with the reference of parent class 
        Computer laptop = new Laptop();
        Computer desktop  = new Desktop();

        Developer developer = new Developer("Navin");

        /* now our developer can code with either desktop or laptop 
           and is not dependent on laptop or desktop but a computer instead */ 
        developer.code(laptop);
        developer.code(desktop);

        /* let's see how it allows reuse of same object name */
        Computer computer; // common reference

        computer = new Laptop();
        computer.develop(developer); // Laptops develop method is called

        computer = new Desktop();
        computer.develop(developer); // Desktops develop method is called

        /* Instead writing it as below would raise an error */
        // Laptop lap = new Laptop();
        // lap.develop(developer);

        // lap = new Desktop();

    }
}
