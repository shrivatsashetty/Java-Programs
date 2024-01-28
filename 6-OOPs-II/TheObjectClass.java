/* Every class in Java by default inherits the Object class */

class SmartPhone{

    public String modelName;
    public int price;

    /* Object class has a method called toString let's override it*/
    @Override
    public String toString(){
        return this.modelName; 
        // by default toString() method of Object class returns null String but we overrided it to return something else
    }

    // a user def method to check if two objects of SmartPhone class are equal by comapring their states
    public boolean equals(SmartPhone other){
        return (this.modelName == other.modelName) && (this.price == other.price);
    }
}

public class TheObjectClass {
    public static void main(String[] args){

        SmartPhone galaxyFirst = new SmartPhone();
        galaxyFirst.modelName = "S21 Ultra";
        galaxyFirst.price = 1000; 

        SmartPhone galaxySecond = new SmartPhone();
        galaxySecond.modelName = "S21";
        galaxySecond.price = 1000; 

        System.out.println(galaxyFirst); // to string method is called

        System.out.print("Are both the galaxy phones same?:");
        System.out.println(galaxyFirst.equals(galaxySecond));
    }
}

