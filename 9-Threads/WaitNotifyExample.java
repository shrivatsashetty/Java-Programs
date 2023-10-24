/* A simple java program to demonstrate the wait() and notify() methods */

public class WaitNotifyExample {
    public static void main(String[] args){

        final Object lock = new Object();

        Thread waitingThread = new Thread(new Runnable(){
            @Override
            public void run(){
                // below we declare that the block of code runs in a syncronised manner on the lock object
                synchronized(lock){
                    System.out.println("Waiting thread is waiting...");
                    try{
                        lock.wait();
                    }catch(Exception e){

                    }
                    System.out.println("Waiting thread awakens!!!");
                    
                }
            }
        }
        
        );

        Thread notifyingThread = new Thread( new Runnable() {

            @Override
            public void run(){

                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){

                }

                synchronized(lock){
                    System.out.println("notifying thread is notifying...");
                    lock.notify();
                }
            }
        }

        );

        waitingThread.start();
        notifyingThread.start();

    }
}
