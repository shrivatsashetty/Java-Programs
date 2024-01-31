/* A java program to demonstrate the static block */  
class HeadPhones{

    public static String gadgetType; // a static attribute
    public int price;
    public String brand;

    /* The static block is called only once irrespective of how many objects we create 
       we use it when we want to instatntiate a variable only once */ 
    static{
        System.out.println("Static block called...");
        gadgetType = "Head Phones"; 
    }

    // constructor method
    HeadPhones(int price, String brand){
        this.price = price;
        this.brand = brand;
        System.out.println("Constructor Called...");
    }

}

public class StaticBlockDemo {
    public static void main(String[] args) {
        
        // create two objects of the HeadPhone class
        HeadPhones boatRockerz = new HeadPhones(2000, "Boat");
        HeadPhones jabraEvolve = new HeadPhones(15000, "Jabra");

        System.out.println("Paying music from " + boatRockerz.brand + " " +  HeadPhones.gadgetType);
        System.out.println("Paying music from " + jabraEvolve.brand + " " + HeadPhones.gadgetType);

    }
}
