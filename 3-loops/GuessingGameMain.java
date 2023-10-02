import java.util.Scanner;

class GuessingGameMain{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // System.out.print("Player 1 enter a number: ");
        // int fixedNumber = input.nextInt();
        int fixedNumber = 45;
       
        while(true){
            System.out.print("Guess the number:  ");
            int usersGuess = input.nextInt();

                    
            if(usersGuess > fixedNumber){
                System.out.println("Entered number is greater than the orignal, try again.");
            }

            else if(usersGuess < fixedNumber && usersGuess >= 0){
                System.out.println("Entered number is smaller than the orignal, try again.");
            }

            else if(usersGuess == fixedNumber){
                System.out.println("Hurray!!! you got that right.");
                break;
            }

            else if(usersGuess < 0){
                System.out.println("The right number is " + " " + fixedNumber + "\n anyways good try" );
                break;

            }
            else
                System.out.println("Invalid input");

            }
            
            input.close();
    }
    
}