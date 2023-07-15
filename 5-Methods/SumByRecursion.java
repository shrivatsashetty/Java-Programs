class SumByRecursion{

    static int summation(int n){
        if(n <= 0){return 0;}
        else{return n + summation(n-1); }
        
    }

    public static void main(String[] args){
        int number = 5;
        int total = summation(number);
        System.out.println("Sum of first " + number + " natural no's is " + total);
    }

    
}