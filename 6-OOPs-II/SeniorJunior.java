/* a java program to demonstrate the super keyword and Object class */

/* super class Senior, every java class extends Object class by default*/
class Senior extends Object{

    public int age; 

    // default constructor 
    public Senior(){
        System.out.println("Senior() Default");
    }

    // parameterised constructor
    public Senior(int age){
        System.out.println("Senior() Parameterised");
        this.age = age;
    }
}

/* lets create a child class of the above class Senior */
class Junior extends Senior{

    // default constructor
    public Junior(){
        // super(); // default constructor of parent class will be called by default, irrespective of wether we mention it or not
        System.out.println("Junior() Default");
    }

    // parameterised constructor
    public Junior(int age){
        super(); // explicitly calling the default constructor of parent class, not required though
        System.out.println("Junior() Parameterised");
        this.age = age;
    }

    public Junior(int age, String name){
        super(age); // to explicitly call the parameterised constructor of parent class 
        System.out.println("Junior() Multi-Parameterised");
        this.age = age;

    }

}


public class SeniorJunior {
    public static void main(String[] args) {

        System.out.println();

        Junior junior1 = new Junior(); // calls default constructor 
        System.out.println("Age:" + junior1.age + "\n");
        Junior junior2 = new Junior(5); // calls parameterised consructor
        System.out.println("Age:" + junior2.age + "\n");
        Junior junior3 = new Junior(10, "Naveen"); // calls multi param constructor 
        System.out.println("Age:" + junior3.age + "\n");
    }
}
