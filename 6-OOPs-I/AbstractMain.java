// a class contianing abstract methods is called abstract class
abstract class People{
    String firstName = "Jhon";
    int age = 20;

    // abstract method is just a declaration of the method with no implementation
    abstract void speak(); 

    // an abstract class can also have non-abstract methods
    void nonAbstractMethod(){
        System.out.println("not abst");
    }
} 

class Student extends People{
        String lastName = "Smith";

        // overriding the speak method
        void speak(){
            System.out.println("My name is " + this.firstName + " My age is " + this.age);
        }
    }
// only the class containing main method can be public in a java file
public class AbstractMain{

    public static void main(String[] args){
        Student student1 = new Student();
        student1.speak();
        System.out.println(student1.firstName);
        
    }
}