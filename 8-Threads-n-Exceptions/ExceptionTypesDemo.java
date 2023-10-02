class ExceptionTypesDemo{
    public static void main(String[] args){
        // lets try to catch zero division error
        int a = 5, result;
        
        try{
            result = a/0;
            System.out.println(result);
        }catch(Exception e){
            System.out.println("An exception occoured");
            System.out.println("Exception name: " + e);
        }
        
        
        System.out.println("Exception if occoured was handled");
    }
}