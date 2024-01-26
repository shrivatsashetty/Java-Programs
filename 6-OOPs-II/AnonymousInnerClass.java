/* In this program we create a simple class and an anonymous inner class */
class Anonymous{
    // simple method
    public void show(){
        System.out.println("anonymous method");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args){

        // overriding one of the methods of the class during instantiation
        Anonymous anonymous = new Anonymous(){
            @Override
            public void show(){
                System.out.println("New implementation from anoymous class");
            }
        };

        anonymous.show();
    }
    
}


