class dtypes{

    public static void main(String args[]){
        int myint = 2147483647;     // int can store -2147483648 to +2147483647
        byte by1 = -128;            // byte can store -128 to 127
        short sh1 = -32768;         // from -32768 to 32767
        long l1 = 123456789l;       // append l at last to explicitly specify the long dtype
        double d1 = -12.34;         // double is default data type for floating point numbers 
        float f1 = 3.14f;           // explicitly specify float data type by appending 'f' at last
        char mychar1 = '#';         // a cahracter should be enclosed in single quotes only
        char mychr2 = '7';
        String mystr1 = "Shri";     // String data type can store multiple characters
        boolean satya = true;       // boolean type
        boolean mitya = false;       

        System.out.println(myint);
        System.out.println(by1);
        System.out.println(sh1);
        System.out.println(l1);
        System.out.println(d1);
        System.out.println(f1);
        System.out.println(mychar1);
        System.out.println(mychr2);
        System.out.println(satya);
        System.out.println(mitya);
        
    }
}