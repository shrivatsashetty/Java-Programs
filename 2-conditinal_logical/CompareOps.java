class CompareOps{
    public static void main(String args[]){
        float num1 = 2.33f;
        float num2 = 2.35f;
        boolean result = num1 == num2;
        System.out.println(num1 + " == " + num2 + " : "+ result);
        System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));

        float f1 = 2.22f;
        double d1 = 2.33d;
        boolean result1 =  f1 == d1; // float & double cant be equal
        System.out.println("float 2.22 == double 2.22 : " + result1);
                  
    }
}