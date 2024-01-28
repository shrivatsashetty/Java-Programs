/* Every class in Java by default inherits the Object class */

class Laptop{

    public String modelName;
    public int price;

    /* Object class has a method called toString let's override it*/
    @Override
    public String toString(){
        return this.modelName; // by default the parent class returns null String
    }

    // a user def method to check if two objects of laptop class are equal 
    public boolean equals(Laptop other){
        return (this.modelName == other.modelName) && (this.price == other.price);
    }
}

public class TheObjectClass {
    public static void main(String[] args){
        Laptop laptop1 = new Laptop();
        laptop1.price = 1030; laptop1.modelName = "Dell";
        Laptop laptop2 = new Laptop();
        laptop2.price = 1000; laptop2.modelName = "Dell";

        System.out.println(laptop1); // to string method is called
        System.out.println(laptop1.equals(laptop2));
    }
}

