/* a java program to demonstrate a singoleton class with lazy initialisation */

class LazyInitSingleton {
    // an instance which is private
    private static LazyInitSingleton lazySingleObj;

    // public attributes for the singleton class
    public String singleName;
    public int singleIntValue;

    // a public method to display the name and  value
    public void displaySingleDetails(){
        System.out.println("Name: " + this.singleName + " Integer value: " + this.singleIntValue);
    }

    // a private constructor
    private LazyInitSingleton(String name, int num){
        this.singleIntValue = num;
        this.singleName = name;
    }

    // public static method to acess the instance
    public static LazyInitSingleton getLazySingleObj(String name, int value){
        if(lazySingleObj == null){
            lazySingleObj = new LazyInitSingleton(name, value);
        }
        return lazySingleObj;

    }

}

public class LazyInitSingletonDemo{
    public static void main(String[] args){
        // get the instance of the single ton class
        LazyInitSingleton singleObj1 = LazyInitSingleton.getLazySingleObj("First Singleton Obj", 9); 
        singleObj1.displaySingleDetails(); // Name: First Singleton ObjInteger value: 9

        LazyInitSingleton singleObj2 = LazyInitSingleton.getLazySingleObj("Second Singleton Obj", 20);
        singleObj2.displaySingleDetails(); // Name: First Singleton ObjInteger value: 9

        // because only one instance is returned
        
    }
}