/* A basic program to illustrate  asynchronus behaviour of threads */

class MyThreadA extends Thread{
    // overriding the run() method of inbuilt Thread class
    public void run(){
        for(int i = 1; i<=50;i++){
            System.out.println("Hi.. from " + this.getName() + " count: " + i);
            try{
                super.sleep(1500); // super.sleep() calls the Thread.sleep()
            }catch(Exception e){
                System.out.println("Exception: " + e);
                System.out.println("Thread A is sleeping..");
            }
        }
    }
}

class MyThreadB extends Thread{
    // overriding
    public void run(){
        for(int i = 1; i <= 50; i++){
            System.out.println("Hello.. from " + this.getName() + " count: " + i);
        }

        try{Thread.sleep(1000);}catch(InterruptedException e){ System.out.println("Thread B is sleeping");}
    }
}

class ThreadsBasicDemo{
    public static void main(String[] args){
        MyThreadA threadA = new MyThreadA();
        MyThreadB threadB = new MyThreadB();

        /* start() is the inbuilt method of thread which starts thread execution
            start() in turn calls the run() method of the thread  */

        threadA.start(); 
        threadB.start();
    }

}