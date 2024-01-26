import java.util.Scanner;

class TwoDimArrayDemo{
    public static void main(String[] args){

        String[][] names = {{"Mr.", "Mrs.", "Ms"}, {"Smith", "Jhon"}};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice below");
        System.out.print("1 for Mr 2 for Mrs: ");
        int i = input.nextInt();
        System.out.print("1 for Smith, 2 for Jhon: ");
        int j = input.nextInt();
        System.out.println(names[0][i-1] + names[1][j-1]);

        System.out.println("Length of outer array:" + names.length);
        System.out.println("length of inner array:" + names[0].length); // length of inner array
        
        input.close();
    }
}