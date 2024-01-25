class OuterClass{
    // an attribute for the outer class
    int a = 9;

    // a method for the outer class
    public void outerClassMethod(){
        System.out.println("Printing from outer class");
    }

    class InnerClass{
        // an attribute of the inner class
        int b = 4;

        // a method of the inner class
        public void innerClassMethod(){
            System.out.println("Printing from within inner class");
        }
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
        
        /* Lets create an object of inner class directly using the constructor of outer class instead of it's object  */
        OuterClass.InnerClass secondInnerObj = new OuterClass().new InnerClass();
        secondInnerObj.innerClassMethod();

        /* creating another object of the inner class 
         * but this time override the method of the inner class 
         * using anonymous inner class
         */
        OuterClass.InnerClass thirdInnerObj = new OuterClass().new InnerClass(){
        
            @Override
            public void innerClassMethod() {
                // providing with a new implementation for innerClassMethod
                System.out.println("printing within from an anonymous inner class");
            }
        };

        // using the newly created object of inner class
        thirdInnerObj.innerClassMethod();


    } 
}