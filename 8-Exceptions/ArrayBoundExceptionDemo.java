class ArrayBoundExceptionDemo{
    public static void main(String[] args){
        int[] marks = {88, 89,78};
        // exception handling part
        try{
            System.out.println(marks[10]);
        } catch(Exception e){
            System.out.println("The following exception occoured\n" + e);
        } finally{
            System.out.println("This is finally block");
        }

        System.out.println("Exception was handled");
        
    }
}