class Printer<T> {

    T toPrint; // the type of T is variable

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
        
        Printer <Integer> printer = new Printer <> (20) ;
        System.out.println(printer.toPrint);
    }
    
}
