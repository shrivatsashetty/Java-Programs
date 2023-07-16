abstract class People{
    String firstName = "Jhon";
    int age = 20;
    abstract void speak();
} 

class Student extends People{
        String lastName = "Smith";

        void speak(){
            System.out.println("My name is " + this.firstName + " My age is " + this.age);
        }
    }

class AbstractMain{

    public static void main(String[] args){
        Student student1 = new Student();
        student1.speak();
        
    }
}