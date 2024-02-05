/* a very famous problem of reversing a string in java */

public class StringReverse {
    
    
    public static void main(String[] args) {

        System.out.println();
        String testString = "Hello";

        System.out.print(testString + " : " );

        for(int i = testString.length(); i > 0; i--){
            System.out.print(testString.charAt(i - 1));
        }
        System.out.println();

    }
    
}
