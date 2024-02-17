/* a program to demonstrate bounded generics */

// a superclass
abstract class Pet{

    String name;

    String petSound;

    // constuctor
    Pet(String name, String petSound){
        this.petSound = petSound;
        this.name = name;
    }

    public abstract void makeCallingSound();
}

// one of the child class
class PetDog extends Pet{

    // calling constructor of the parent class
    PetDog(String name, String petSound){
        super(name, petSound);
    }

    @Override
    public void makeCallingSound(){
        System.out.println(this.petSound);
    }
}

// another child class
class PetCat extends Pet{

    // calling constructor of the parent class
    PetCat(String name, String petSound){
        super(name, petSound);
    }


    @Override
    public void makeCallingSound(){
        System.out.println(this.petSound);
    }
}

// our actual generic class
class GenericPet <T extends Pet> {

    T pet;

    GenericPet(T pet){
        this.pet = pet;
    }
    
    public void printName(){
        System.out.println("Name :" + pet.name);
    }

    public void makeSound(){
        pet.makeCallingSound();
    }
}

public class AnimalGenericsDemo {
    public static void main(String[] args) {
        GenericPet<PetDog> genericPet = new GenericPet<>(new PetDog("Jimmy", "bark.."));
        genericPet.printName();
        genericPet.makeSound();
    }
}
