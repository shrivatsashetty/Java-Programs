
class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Thread1: " + i);
            try {
                Thread.sleep(2000);
               // Thread.join();
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }	
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 6; i <= 10; i++) {
            System.out.println("Thread2: " + i);
            try {
                Thread.sleep(2000);
                //Thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class LifeOfThread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        

        try {
            t1.sleep(1000);
            t1.interrupt(); 
            //t1.join();// Increase sleep time to 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


 	 t2.start();
 try {
            t2.sleep(1000); 
             t2.interrupt();
             //t2.join();

            // Increase sleep time to 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
     
        
        System.out.println("Threads life cycle completed");
    }
}