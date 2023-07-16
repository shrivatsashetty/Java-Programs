abstract class People{
    String firstName = "Jhon";
    int age = 20;
    abstract void speak();
} 

class AbstractMethod{

    static class Student extends People{
        String lastName = "Smith";

        void speak(){
            System.out.println("Hello I'am a student and can speak");
        }
    }

    public static void main(String[] args){
        Student student1 = new Student();
        student1.speak();
        
    }
}