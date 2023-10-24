public class ThreadSleep {
    public static void main(String[] args){

        Thread sampleThread = new Thread(new Runnable(){

            @Override
            public void run(){
                System.out.println("Thread is going to sleep in ");
                for(int i = 3; i >= 1; i-- ){
                    System.out.println(i);
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){/* catching exception but not handling */}
                }

                System.out.println("Thread sleeping....");
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){/* catching exception but not handling */}
                    System.out.println("Thread wakes up");
                
            }

        });

        sampleThread.start();

    }
}
