class SampleOuterClass{

    int outerAttr = 30;

    static class StaticInnerClass{
        int innerAttr = 20;
    }
}

class StaticInnerClassDemo{
    public static void main(String[] args){
        SampleOuterClass sampleOuterObj = new SampleOuterClass();
        System.out.println("Outer class attribute: " + sampleOuterObj.outerAttr);
        /* acessing the atribute of the StaticInnerClass 
         * for this we create a new object of the inner class 
         * creating the object of the static inner class is a little diffrent from that of creating non static inner class
         * for creating the objects of non static inner class refer program NestedClassesMain.java
        */
        SampleOuterClass.StaticInnerClass innerObj = new SampleOuterClass.StaticInnerClass(); // cretion of static inner class obj
        System.out.println(innerObj.innerAttr);

    }
    
}
