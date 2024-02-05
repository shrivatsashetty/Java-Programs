public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer myStrBuffer = new StringBuffer();
        System.out.println(myStrBuffer.capacity()); // 16

        myStrBuffer = new StringBuffer("Vatsa");
        System.out.println(myStrBuffer.capacity()); // 21 i.e 16 + 5

        myStrBuffer.append(" Shetty");
        System.out.println(myStrBuffer); // Vatsa Shetty

        String myName = myStrBuffer.toString();
        System.out.println(myName.getClass()); // class java.lang.String
        System.out.println(myStrBuffer.getClass()); // class java.lang.StringBuffer

        myStrBuffer.deleteCharAt(2);
        System.out.println(myStrBuffer);

        // insert string at a specific index
        myStrBuffer.insert(0, "Shri ");
        System.out.println(myStrBuffer);

    }
}
