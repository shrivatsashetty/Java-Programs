/* static attributes of a class can be accessed directly 
   using the class itself without creating an object of that class */

// we first create a class with static attributes and methods 
class StaticAttributes {
    // assign a static attribute
    static String name = "Some Static Name";
    
    // assign a static method
    public static void printName(){
        System.out.println(name);
    }    
    
}

// class containing main method
public class StaticAttributesDemo{
	public static void main(String[] args) {

        System.out.println(); // just to print an empty line to make o/p neat
		StaticAttributes.printName();
		
	}
}
