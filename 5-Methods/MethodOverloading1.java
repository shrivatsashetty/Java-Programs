/* Java Program to demonstrate method overloading */
class MethodOverloading1{
    // orignal method
    public static int calculate(int number){
        System.out.println("Method called with one argument, square is " + number * number);
        return number * number;
    }
    //overloded
    public static int calculate(int a, int b){
        System.out.print("Method called with two argument, ");
        System.out.println("Product is " + a * b);
        return a * b;
    } 
    // overloaded with arguments of diffrent data type
     public static double calculate(double num1, double num2){
        System.out.print("Method called with three argument, ");
        System.out.println("Division yeilds " + num1 / num2);
        return num1 / num2 ;
    } 
    // main method
    public static void main(String[] args){
        calculate(2);
        calculate(2,4);
        calculate(8.34, 2.45);


    }


}