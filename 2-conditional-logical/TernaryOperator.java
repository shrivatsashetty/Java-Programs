class TernaryOperator{
    public static void main(String args[]){
        // greater using ternary
        int x = 10;
        int y = 5;
        System.out.println((x > y) ? ( x + " is greater than " + y ) : ( y + " is greater than " + x ) );
        
        /* In Java ternary operatosr are used to return a value based on a certain condition
            and cant be used to implement a block of code like in C programming   */

        // even or odd using ternary
        int num = 3;
        String result = (num % 2 == 0) ? "Even" : "Odd" ;
        System.out.println(num + " is " + result);

    }
}