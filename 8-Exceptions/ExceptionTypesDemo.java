class ExceptionTypesDemo{
    public static void main(String[] args){
        System.out.println("\nOutput:\n");
        // lets try to catch zero division error
        
        try{
            // int result = 5/0;
            // System.out.println(result);

            int[] ages = {12,34,45, 50};
            ages[10] = 4; // trying to acess an element out of bound
            System.out.println(ages[10]);


        }catch(ArithmeticException e){ 
            /* this block only handles arithmetic exception */
            System.out.println("Cant divide a number by zero, doing so will cause: " + e);
            
        }catch(ArrayIndexOutOfBoundsException e){ 
            /* this block only handles array index out of bounds exception */
            System.out.println("Trying to acess element out of bound");
            System.out.println("This will cause:\n  " + e);

        }catch(Exception e){ 
            /* Handling any other type of exception */
            System.out.println("Some exception occoured..");
        }finally{
            /* finally block executes irrespective of any exception occurs or not */
            System.out.println("Message from finally block:");
            System.out.println("  All exceptions if occured were handeled ");
        }
        
        
        System.out.println("END OF THE PROGRAM");
    }
}