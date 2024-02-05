/* this program demonstrates the use of annotations especially the @Override */


class SuperClass{
    public void methodBelongingToTheParentClass(){
        System.out.println("method orignally belonging to superclass called");
    }
}

class SubClass extends SuperClass{
    // without annotations which is the below method and considers it as a new one
    // notice the small difference "The" is missing in methods name
    public void methodBelongingToParentClass(){ 
        System.out.println("this is child class's own method");
    }

    // with annotations Java compiler knows that it's the method of the parent class 
    // about which the developer is talking about and wants to override
    @Override
    public void methodBelongingToTheParentClass(){
        System.out.println("overrided method of parent class is called");
    }
}
public class AnnotationsImportance {
    public static void main(String[] args) {

        System.out.println();

        SubClass subClassObj = new SubClass();

        subClassObj.methodBelongingToParentClass();
        subClassObj.methodBelongingToTheParentClass();
    }
}
