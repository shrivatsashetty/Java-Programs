class Rules{
    public static final int TOTAL_LAPS = 10;
    public static boolean winnerFound = false;
    public static String winner;

}


class Suzuki extends Thread{

    long waitTime;

    Suzuki(long waitTime){
        this.waitTime = waitTime;
    }
    
    public void run(){

        // -

        for(int i = 0;i <= Rules.TOTAL_LAPS; i++){
            System.out.println(this.getName() + " completes " +  i + " laps ");

            try{Thread.sleep(1004);
            }catch(InterruptedException e){ 
                System.out.println(this.getName() + " Skids... but gets back up");
            }
            System.out.println("Current bike throttling : " + Thread.currentThread().getName());

        }
        System.out.println( this.getName() + " finishes race!!!!");
    }
}

class TVS extends Thread{

    long waitTime;

    TVS(long waitTime){
        this.waitTime = waitTime;
    }

    public void run(){
        for(int i = 0;i <= Rules.TOTAL_LAPS; i++){
            System.out.println(this.getName() + " completes " +  i + " laps ");

            try{Thread.sleep(2020);
            }catch(InterruptedException e){ 
                System.out.println(this.getName() + " Skids... but gets back up");
            }
            System.out.println("Current bike throttling : " + Thread.currentThread().getName());

            if((i ==  Rules.TOTAL_LAPS) && (Rules.winnerFound != true)){
                Rules.winnerFound = true;
                Rules.winner = this.getName();
            }
        }
        System.out.println( this.getName() + " finishes race!!!");

    }
}

class Honda extends Thread{

    long waitTime;

    Honda(long waitTime){
        this.waitTime = waitTime;
    }
    
    public void run(){
        for(int i = 0;i <= Rules.TOTAL_LAPS; i++){
            System.out.println(this.getName() + " completes " +  i + " laps ");

            try{Thread.sleep(1560);
            }catch(InterruptedException e){ 
                System.out.println(this.getName() + " Skids... but gets back up");
            }
            System.out.println("Current bike throttling : " + Thread.currentThread().getName());

            if((i ==  Rules.TOTAL_LAPS) && (Rules.winnerFound != true)){
                Rules.winnerFound = true;
                Rules.winner = this.getName();
            }

        }
        System.out.println( this.getName() + "finishes race!!!");
    }
}




public class MotoGPDemo {
    public static void main(String[] args){
        Suzuki suszuki = new Suzuki(2000);
        TVS tvs = new TVS(1010);
        Honda honda = new Honda(900);

        suszuki.setName("Gixer");
        tvs.setName("Apache");
        honda.setName("Hornet");

        // tvs.setPriority(Thread.MAX_PRIORITY);
        // honda.setPriority(Thread.NORM_PRIORITY);
        // suszuki.setPriority(Thread.MIN_PRIORITY);

        tvs.start();
        suszuki.start();
        honda.start();

        System.out.println("Thread Priorities");
        System.out.println("Apache's Priority: " + tvs.getPriority());
        System.out.println("Gixers's Priority: " + suszuki.getPriority());
        System.out.println("Hornet's Priority: " + honda.getPriority());

        // System.out.println("Thread under execution " + Thread.currentThread().getName());

        try{
            suszuki.join();
            honda.join();
            tvs.join();
        }catch(InterruptedException e){

        }

        System.out.println("Race complete");
        System.out.println("The winner is " + Rules.winner);
        
        



    }
    

    

}
