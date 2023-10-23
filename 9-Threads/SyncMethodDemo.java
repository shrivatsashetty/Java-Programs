
class Counter{
    public static int count = 0;

    public static synchronized void increment(){
        count++;
    }
}

class A extends Thread{
    public void run(){
        for(int i = 0; i < 50; i++ ){
            Counter.increment();

            try{
                Thread.sleep(1500);
            }catch(InterruptedException e ){
                System.out.println("Thread " + this.getName() + " was interrupted " );
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 0; i < 50; i++ ){
            Counter.increment();
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e ){
                System.out.println("Thread " + this.getName() + " was interrupted " );
            }
        }  
    }
}

public class SyncMethodDemo {

    public static void main (String[] args){

        A a = new A();
        B b = new B();

        a.start();
        b.start();

        try{
            a.join();
            b.join();

        }catch(InterruptedException e){
            System.out.println(e);
        }
        

        System.out.println("Final value of static variable count = " + Counter.count);

    }

    
    
}
