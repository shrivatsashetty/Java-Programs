class Literals{
    public static void main(String args[]){

        /* bin and hex numbers in java */
        int bin_num = 0b1010; // 10
        int hex_num = 0x1E;  // 30

        /* to distinguish zeroes or digits */
        int _num = 2_30_00_000_0; // 230000000

        /* example of implicit type casting where a float is auto conv to double */
        float num = 5f; // 5.0

        /* writing numbers in scientific notation */
        double bigNum = 3e5; // 300000.0
        
        System.out.println(bin_num);
        System.out.println(hex_num);
        System.out.println(_num);
        System.out.println(num);
        System.out.println(bigNum);
        char mychar = 'a';
        System.out.println(mychar); // a
        mychar++;
        System.out.println(mychar); // b



    }
}