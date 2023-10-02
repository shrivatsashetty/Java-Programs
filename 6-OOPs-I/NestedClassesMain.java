class OuterClass{
    int a = 9;

    class InnerClass{
        int b = 4;
    }

}

class NestedClassesMain{
    public static void main(String[] ars){
        //first create an instance of outer class
        OuterClass outerObject = new OuterClass();
        
        // we use the instance of the outer class to create an instance of the inner class
        OuterClass.InnerClass innnerObject = outerObject.new InnerClass();
        System.out.println("Outer class attribute: " + outerObject.a); // outer attribute
        System.out.println("Inner class attribute: " + innnerObject.b); 
        
    } 
}