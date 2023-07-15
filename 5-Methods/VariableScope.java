class VariableScope{

    private static int x = 20; // global variable within the class
    
    public static void main(String[] args) {
        System.out.println("Calling x from main method, x = " + x);
        myMethod();
    }
    
    private static void myMethod(){
        System.out.println("callin x from myMethod, x =  " + x);
        int y = 40; // scope limited to method 
        System.out.println("Calling y from myMethod, y = " + y);
    }

}