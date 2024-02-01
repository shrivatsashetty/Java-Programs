class SumByRecursion{

    // a recursive method outside defined outside the main method
    static int summation(int n){
        if(n <= 0){return 0;}
        else{return n + summation(n-1); }
        
    }

    // main method calls the recursive method
    public static void main(String[] args){
        int number = 5;
        int total = summation(number);
        System.out.println("Sum of first " + number + " natural no's is " + total);
    }

    
}