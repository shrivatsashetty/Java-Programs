/* Java program to demonstrate Generics in Java */

/* Lets create a generic class called Printer */
class Printer<T> {

    T toPrint; // the type T of variable t s not fixed

    // constructor for the generic class
    public Printer(T toPrint){
        this.toPrint = toPrint;

    }

    public void print(){
        System.out.println("The generic instance is " + toPrint);
    }

}



public class GenericPrinterMain {
    public static void main(String[] args){
        System.out.println("\n");
        
        // creating a Integer type object and passing to our generic class
        Printer<Integer> intPrinter = new Printer<> (20) ;
        System.out.println(intPrinter.toPrint);


        // creating a Double type object
        Printer<Double> doublePrinter = new Printer<> (3.144);
        System.out.println(doublePrinter.toPrint);

        // with string 
        Printer<String> name = new Printer<>("Harsha");
        System.out.println(name.toPrint);

    }
    
}
