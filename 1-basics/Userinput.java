import java.util.Scanner;

public class Userinput{
	public static void main(String[] args) {
	    
	    Scanner intake = new Scanner(System.in);
	    System.out.print("Input an integer: ");
	    int myint = intake.nextInt();
	    System.out.println("Your int is " + myint);
	    
	    System.out.print("Enter a float: ");
	    float myfloat = intake.nextFloat();
	    System.out.println("Your float is " + myfloat);
	    
	    System.out.print("Enter a double: ");
	    double mydouble = intake.nextDouble();
	    System.out.println("Your double is " + mydouble);
	    
	    System.out.print("Enter a string: ");
	    String mystring = intake.next();
	    System.out.println("Your string is " + mystring);
	    intake.close();
	    
	    
// 		System.out.println("");
	}
}
