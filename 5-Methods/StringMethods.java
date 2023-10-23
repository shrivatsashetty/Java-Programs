/* A Java program to demonstrate various string methods */

// import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args){

        System.out.println("\nOutput:\n");

        String qwerty = "Qwerty";

        // Length of the string
        System.out.println(qwerty + " has " + qwerty.length() + " characters");

        // convert to uppercase and lower case
        System.out.println(qwerty.toUpperCase());
        System.out.println(qwerty.toLowerCase());

        String scentence = "A quick Brown Fox jumps over a lazy Dog. Foxes are intelligent & dogs obedient";
        
        // Finding a character in a string 

        System.out.println("string Fox occurs @ index " + scentence.indexOf("Fox")); // search for a sub string 
        System.out.println("The character B occurs at index: " + scentence.indexOf('B')); // search for a character

        // get character @ a specified index
        System.out.println("character @ index 3 is " + scentence.charAt(3));
        // StringIndexOutOfBoundsException demo
        try{
            System.out.println(scentence.charAt(scentence.length()));

        }catch(StringIndexOutOfBoundsException e){
            System.out.println("character index out of bounds ");
            System.out.println("Last charcter is " + scentence.charAt( scentence.length() - 1 ));

        }finally{
            System.out.println("Printing from finally block\nWhatever exception might have occured was handled");
        }

        // searching for a sequence of char using contains() method
        System.out.println("The scentence contains contains substring Dog: " + scentence.contains("Dog"));
        System.out.println();

        String capitalisedText = "THIS TEXT IS TYPED WITH CAPS LOCK ON";
        System.out.println("string \"caps\" occours in capitalised text " + capitalisedText.toLowerCase().contains("caps"));

        // Equality of string using equals() method
        System.out.println("HELLO & hello are the same: " + "HELLO".toLowerCase().equals("hello"));


        // taking a text string as user input  
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter first name: ");
        // String firstName =  scanner.nextLine();
        // System.out.print("Enter last name: ");
        // String lastName = scanner.nextLine();
        // System.out.println("Full name: " + firstName.concat(lastName));


        // scanner.close();
           
         
    }
    
}
