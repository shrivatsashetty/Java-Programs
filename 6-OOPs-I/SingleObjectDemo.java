/* this program is an examle of the eager initialisation singleton pattern */

class Singleton{

    private Singleton(){
        // empty constructor
    }

    private static Singleton singleInstance = new Singleton();


    public static Singleton getInstance(){
        return singleInstance;
    }

    public void singleMethod(){
        System.out.println("I'm a method of single ton class");
    }
}


public class SingleObjectDemo{
    public static void main(String[] args){

        Singleton singleObject = Singleton.getInstance();

        singleObject.singleMethod();

    }
}