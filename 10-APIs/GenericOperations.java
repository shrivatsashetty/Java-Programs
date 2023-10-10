import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class Generics<T extends Number>{

    List<T> genericList = new ArrayList<>();

    ArrayList<Integer> intList = new ArrayList<>(); 

    ArrayList<Double> doubleList = new ArrayList<>();

    public void appendNumber(T number){

        genericList.add(number);
        if(number instanceof Integer ){

            intList.add((Integer)number);

        }
        else if(number instanceof Double){

            doubleList.add((Double)number);

        }
        
    }

    /* Add integer method */
    public int addInts(){
        int intSum = 0;
        for(Integer number : intList){
            intSum += number;
        }
        return intSum;
    }

     /* Method to sum Doubles */
     public double addDoubles(){
        double doubleSum = 0.0d;
        for(Double number : doubleList){
            doubleSum += number;
        }
        return doubleSum;
     }

    
     // method to sort Ineger
    public void  sortInt(){

        ArrayList<Integer> intSortList = new ArrayList<>();
        for(T item : genericList){
            if(item instanceof Integer){
                intSortList.add((Integer)item);
            }
            intSortList.add((Integer)item);
        } 
        Collections.sort(intSortList);
        System.out.println("Sorted integers" + intSortList);
    }

    // method to sort Double
    public void sortDouble(){
        ArrayList<Double> sortedDoubles = new ArrayList<>();

        for(Double item : doubleList){
            sortedDoubles.add(item);
        }
        Collections.sort(sortedDoubles);
        System.out.println("Sorted Doubles: " + sortedDoubles);
        
    }

}


public class GenericOperations {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Generics<Integer> intGen = new Generics<Integer>();
        Generics<Double> doubleGen = new Generics<>();


        while(true){
            System.out.println("------MENU------");
            System.out.println("1. Add Integer");
            System.out.println("2. Add Double");
            System.out.println("3. Sum Integer");
            System.out.println("4. Sum Double");
            System.out.println("5. Sort Integer");
            System.out.println("6. Sort Double");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter integer: ");
                    int intValue = scanner.nextInt();
                    intGen.appendNumber(intValue);
                    break;

                case 2:
                    System.out.print("Enter double: ");
                    double doubleValue = scanner.nextDouble();
                    doubleGen.appendNumber(doubleValue);
                    break;

                case 3:
                    int total = intGen.addInts();
                    System.out.println("Integer sum: " + total);
                    break;

                case 4:
                    double sum = doubleGen.addDoubles();
                    System.out.println("Sum of Doubles: " + sum);
                    break;

                case 5:
                    intGen.sortInt();
                    break;

                case 6:
                    doubleGen.sortDouble();
                    break;

                case 7:
                    scanner.close();
                    return;

            }





        }
    }
    

}
