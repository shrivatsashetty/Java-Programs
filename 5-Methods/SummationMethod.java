class SummationMethod{
    // below we create a static method which is callable without an object
    static int calculateSum(int a, int b){ 
        return a + b;
    }
    // in main method we call the static method
    public static void main(String[] args){
        int a = 2; int b = 5;
        int result = calculateSum(a, b);
        System.out.println("The sum is " + result);

    }
}