/* Java program to illustrate constructors */

class Person{
    private String name;
    private int age;
    
    // below is the constructor method
    protected Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    private void sayName(){
        System.out.println("Hi my name is " + this.name + " and I'm " + this.age + " years old");
    }


    public static void main(String[] args){
        Person person1 = new Person("Shashi", 30);
        Person person2 = new Person("Manoj", 22); 
        
        person1.sayName();
        person2.sayName();

    }
    
 }