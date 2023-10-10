import java.util.Scanner;


public class ThrowsDemo {
    public static void main(String[] args){

        System.out.println("\n");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("\nEnter b: ");
        int b = scanner.nextInt();
        
        try{
            float result = numberDivider(a, b);
            System.out.println("Division result: " + result);

        }catch(ArithmeticException e){
            System.out.println("Follwing exception occoured: " + e);
            System.out.println("Denominator canr be zero");
        }
        
        scanner.close();
    }

    public static float numberDivider(int a, int b) throws ArithmeticException{
        float result = a/b;
        return result;
    }



}
