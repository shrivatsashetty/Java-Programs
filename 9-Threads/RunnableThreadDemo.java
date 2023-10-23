class Hi implements Runnable{
    // providing implementation for run() method of Runnable interface
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Hi..");
            try{ Thread.sleep(1000);}catch(Exception e){};
        }
        
    }
} 


class Hello implements Runnable{
    // providing implementation for run() method of Runnable interface
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Hello..");
            try{ Thread.sleep(2000);}catch(Exception e){};
        }
        
    }
}

public class RunnableThreadDemo{
    
    public static void main(String[] args){
        
        /* Now we create objects of classes Hi and Hello which implemented Runnable interface
           we can create reference to parent interface and object of child class */ 
        Runnable runnableHiObj = new Hi(); 
        Runnable runnableHelloObj = new Hello();

        // creating objects of Thread class itself and passing the objects of the Runnable class to the constructor
        // Also can pass a string as name to thread
        Thread hiThread = new Thread(runnableHiObj, "Hi Thread "); 
        Thread helloThread = new Thread(runnableHelloObj, "Hello Thread");

        // naming the thread using setName() method
        hiThread.setName("Hi Wala Thread");
        helloThread.setName("Hello Wala Thread");

        System.out.println(hiThread.getName() + " & " + helloThread.getName() + " started");
        
        /* this start method will now call the run() method of Hi Runnable Class 
           coz we have passed its obj to Thread constructor */
        hiThread.start(); 
        helloThread.start();

        // isAlive() method
        if(hiThread.isAlive()){
            System.out.println(hiThread.getName() + " with ID " + hiThread.getId() + " is still alive ");
        }else{System.out.println(hiThread.getName() + " with ID " + hiThread.getId() + " is is dead ");}

        // join() method // always has to be enclosed in a try-catch block
        try{
            hiThread.join();
            helloThread.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        
        // now check if the thread is alive
        if(hiThread.isAlive()){
            System.out.println(hiThread.getName() + " with ID " + hiThread.getId() + " is still alive ");
        }else{
            System.out.println(hiThread.getName() + " with ID " + hiThread.getId() + " is is dead ");
        }
        

        System.out.println("Both threads completed their job");
        
    }
}
