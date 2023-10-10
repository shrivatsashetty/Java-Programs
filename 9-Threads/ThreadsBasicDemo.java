/* A basic program to illustrate  asynchronus behaviour of threads */
class MyThreadA extends Thread{
    // overriding the run() method of inbuilt Thread class
    public void run(){
        for(int i = 1; i<=50;i++){
            System.out.println("Hi.. from " + this.getName() + i);
            try{
                super.sleep(5);
            }catch(Exception e){
                System.out.println("Exception: " + e);
                System.out.println("Thread A is waiting..");
            }
        }
    }
}

class MyThreadB extends Thread{
    // overriding
    public void run(){
        for(int i = 1; i <= 50; i++){
            System.out.println("Hello.. from " + this.getName() + i);
        }
    }
}

class ThreadsBasicDemo{
    public static void main(String[] args){
        MyThreadA threadA = new MyThreadA();
        MyThreadB threadB = new MyThreadB();

        /* start() is the inbuilt method of thread which starts thread execution
            it in turn calls the run() method of the thread  */

        threadA.start(); 
        threadB.start();
    }

}