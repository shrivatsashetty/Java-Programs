import java.util.Scanner;

public class ThrowExceptionDemo {
    public static void main(String[] args){
        System.out.println("\nOutput:\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n-----------Word Letter Counter-------------\n");
        System.out.print("Enter a word of minimum 4 letters: ");
        String word = scanner.nextLine();

        try{

            if(word.length() < 4){
                /* create a new Exception object and throw it with a message to print */
                Exception myException = new Exception("Dont want to print small words", null);
                throw myException;
                          
            }

            System.out.println("\nThe no of letters in " + word + " is " + word.length() + "\n");
            // deliberately causing exception 

        }catch(Exception e){
            System.out.println(e);

            if(e.getCause() == null){
                System.out.println(" Cause of exception is unknown");
            }else{
                System.out.println("exception caused by: " + e.getCause().toString());
            }
            
            System.out.println(" Plz enter a word greater than 4 characters \n");
        }finally{
            System.out.println("Printing from finally block:");
            System.out.println("  All exceptions were handled sucessfully!");
            scanner.close();
        }

        System.out.println("---END OF THE PROGRAM----");



    }
}
