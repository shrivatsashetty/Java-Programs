class JavaArray1{
    public static void main(String[] args){
        int[] numbers = {7,8,5,4,3,2};
        System.out.println(numbers[0]);
        float pointNums[]; // declaration of array
        pointNums = new float[3];
        // initialising one by one
        pointNums[0] = 1.1f;
        pointNums[1] = 2.4f;
        pointNums[2] = 3.5F;
        System.out.println(pointNums[0]);
        System.out.println(numbers.length);
        System.out.println("Printing array elements");
        for(int i = 0; i < numbers.length;i++){
            System.out.println(numbers[i]);
        }

    }
}