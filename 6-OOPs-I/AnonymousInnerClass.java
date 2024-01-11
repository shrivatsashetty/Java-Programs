/* In this program we create a simple class and an anonymous inner class */
class Anonymous{
    // simple method
    public void show(){
        System.out.println("anonymous method");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args){

        Anonymous anonymous = new Anonymous(){
            @Override
            public void show(){
                System.out.println("New implementation form anoymous class");
            }
        };

        anonymous.show();
    }
    
}


