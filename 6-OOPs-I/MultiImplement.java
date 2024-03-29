/* This is a java program to to demonstrate multiple implementation of interfaces by a class */

interface Inter1{
    /* An interface can contain class variables that are static and final */
    static final int inter1InstanceVar = 5;

    void inter1Method1();
}

interface Inter2{
    
    static final int inter2InstanceVar = 10;
     /* By default interface mthods are public */
    void inter2Method2();
}

/* A class whch implements multiple interfaces 
 * must provide an implementation to all of the methods of those interfaces
  */
class InterImplementer implements Inter1, Inter2{
    // providing implementation for method of interface 1
    @Override
    public void inter1Method1(){
        System.out.println("I'am method 1 of interface 1");
    }
    // providing implementation for method of interface 2
    @Override
    public void inter2Method2(){
        System.out.println("This is method 2 of interface 2");
    }

} 

class MultiImplement{
    public static void main(String args[]){

       InterImplementer obj = new InterImplementer();

       obj.inter1Method1();
       System.out.println("Interface 1 has a data member: " + InterImplementer.inter1InstanceVar); // 
       
       obj.inter2Method2();
       System.out.println("Interface 2 has a data member: " + InterImplementer.inter2InstanceVar);

    }
}