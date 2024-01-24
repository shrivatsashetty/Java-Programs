/* A program to demonstrate abstract class and abstract methods */

abstract class Animal{
    
    public abstract void walk();
}


class Human extends Animal{
    
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


