/* This program demonstrates a new method of creating an instance of an inner nested class */
class Outer{
    int outerAttribute = 20;

    class Inner{
        int innerAttribute = 10;
    }
}

// class containing main method(must be public)
class InnerClassObject{
    public static void main(String[] args){
        Outer outerobj = new Outer();
        System.out.println(outerobj.outerAttribute);
        // creating an instance of inner class
        Outer.Inner innerObj = new Outer().new Inner();
        System.out.println(innerObj.innerAttribute); 
    }
}