/* Strings are not primitive data type instead they are objects  */

public class TheString {
    public static void main(String[] args) {

        // since a string is an object it can be initaialised as follows
        String myName = new String("Shrivatsa");

        /* Strings are nothing but character sequence 
         * here's one more way we can instantiate a String object */
        char[] charSequence = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
        String myStr = new String(charSequence);
        System.out.println(myStr); // Hello World

        /* string methods */ 

        // character at a particular index
        System.out.println(myName.charAt(0)); // s
        // slicing or finding substring
        System.out.println(myStr.substring(6, 9)); // Wor
        // length of a string
        System.out.println(myStr.length()); // 11
        // concat two string
        System.out.println("Hey".concat(" Bro")); // Hey Bro
        // check if a substring exist in the given string
        System.out.println("Hi Mom".contains("Mom")); // true
        // check if a string ends with the specified string
        System.out.println("The End".endsWith("nd")); // true
        // case sensitive comparision
        System.out.println("Hello".equals("hello")); // false
        // case insensitive comparision
        System.out.println("Hello".equalsIgnoreCase("heLLo")); // true
        // get index of the first occurance specified character within the string
        System.out.println("OneTwoThree".indexOf('T')); // 3
        // replace a character
        System.out.println("Six".replace("S", "F")); // Fix
        // converting to lowercase and uppercase
        System.out.println("a MiX of UPPer AnD lowEr casE".toUpperCase()); // A MIX OF UPPER AND LOWER CASE
        System.out.println("a MiX of UPPer AnD lowEr casE".toLowerCase()); // a mix of upper and lower case

    }    
}
