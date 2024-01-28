/* Wrapper classes store primitive data type into Objects */

public class WrapperClasses {
    public static void main(String[] args) {
        
        Integer nineObj = 9; //autoboxing
        System.out.println(nineObj);
        System.out.println("nineObj belongs to: " + nineObj.getClass());

        int nine = nineObj.intValue(); // returns the primitive data type 9

        System.out.println(nineObj instanceof Integer);

        String tenString = "10";
        System.out.println( Integer.parseInt(tenString) * nine); // 20


    }
}
