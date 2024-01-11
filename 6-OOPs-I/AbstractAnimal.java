/* A program to demonstrate abstract class and abstract methods */
abstract class Animal{
    
    public abstract void walk();
}


class Human extends Animal{
    
    @Override
    public void walk(){
        System.out.println("Human on two legs");
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
        Human human = new Human();
        Dog dog = new Dog();
        dog.walk();
        human.walk();
    }
}


