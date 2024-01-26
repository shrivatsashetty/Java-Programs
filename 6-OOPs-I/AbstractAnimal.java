/* A program to demonstrate abstract class and abstract methods
 * an abstract class can contain both abstract and non abstract methods as well
 */


 // create an abstract class
abstract class Animal{
    
    public abstract void walk();

    public void run(){
        System.out.println("Running at godspeed...");
    }
}


class Human extends Animal{
    // implementation for the inherited abstract methods must be given
    @Override
    public void walk(){
        System.out.println("Human walks on two legs");
    }
    
}


class Dog extends Animal{
    
    @Override
    public void walk(){
        System.out.println("Dog walk on four legs");
    }
}

public class AbstractAnimal{
    public static void main(String args[]){
        // object creation
        Human human = new Human();
        Dog dog = new Dog();
        // calling the method
        dog.walk();
        human.walk();
    }
}


