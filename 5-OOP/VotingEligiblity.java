import java.util.Scanner;
class VotingEligiblity{
    public static void CheckAge(int age){
        if(age < 18){
            System.out.println("Sorry, not elegible to vote");
        }
        else{
            System.out.println("You can vote");
        }
    }

    public static void main(String[] args){
        System.out.print("Enter your age: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        CheckAge(age);

    }
    
}