import java.util.Random;

public class RandomValueGenerationDemo {
    public static void main(String[] args){
        Random randomValue = new Random();

        int randomInt = randomValue.nextInt(7); // giving 6 as argument generates an integer in the range 0-6 both inclusive
        System.out.println("Randomly generated integer: " + randomInt);


    }
    


}
