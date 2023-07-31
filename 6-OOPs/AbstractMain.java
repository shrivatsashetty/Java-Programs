abstract class People{
    String firstName = "Jhon";
    int age = 20;
    abstract void speak(); // abstract method cannot have a body
} 

class Student extends People{
        String lastName = "Smith";

        // overriding the speak method
        void speak(){
            System.out.println("My name is " + this.firstName + " My age is " + this.age);
        }
    }

class AbstractMain{

    public static void main(String[] args){
        Student student1 = new Student();
        student1.speak();
        System.out.println(student1.firstName);
        
    }
}