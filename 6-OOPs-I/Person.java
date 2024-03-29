/* Java program to illustrate constructors */

class Person{
    private String name;
    private int age;
    
    // below is the constructor method
    protected Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    private void selfIntroduce(){
        System.out.println("Hi, my name is " + this.name + " and I'm " + this.age + " years old");
    }


    public static void main(String[] args){
        // creating objects of the class
        Person person1 = new Person("Shashi", 30); 
        Person person2 = new Person("Manoj", 22); 
        
        // calling the methods via the objects
        person1.selfIntroduce();
        person2.selfIntroduce();

    }
    
 }