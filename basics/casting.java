class casting{
    public static void main(String args[]){
        byte b;
        int a = 384;
        /* explicit conversion from int to byte */
        b = (byte)a;
        System.out.print("int value : ");
        System.out.println(a); // int value : 256
        System.out.print("same int value converted to byte is "); 
        System.out.println(b); // byte value : 0

        /* Explicit conversion from float to int */
        float f = -5.67f;
        System.out.println("float number is " + f);
        int i = (int)f;
        System.out.println("same float number explicitly converted to int is " + i); // -5

        /* TYPE PROMOTION */
        byte x = 127; // 127 is last number a byte can represent
        byte y = 2;
        int result = x + y; // byte + byte = int
        System.out.println("result is " + result); // result is 129

        // explicitly casting will prevent error
        byte sum = (byte)(x+y);
        System.out.println("Sum is " + sum); // Sum is -127

    }
}