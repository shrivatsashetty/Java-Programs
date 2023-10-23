class Rules{
    public static final int TOTAL_LAPS = 5;
    public static String first="NULL";


}


class Suzuki extends Thread{
    // TVS t = new TVS();
    
    public void run(){
        for(int i = 0;i <= Rules.TOTAL_LAPS; i++){
            System.out.println(this.getName() + " completes " +  i + " laps ");

            if(!this.isAlive()){
                System.out.println(this.getName() + " finishes race");
            }
            try{Thread.sleep(2004);
            }catch(InterruptedException e){ 
                System.out.println(this.getName() + "Skids... but gets back up");
            }
            if(Rules.TOTAL_LAPS==i && Rules.first=="NULL")
            {
                System.out.println(this.getName()+ " Wins the race");
                Rules.first=this.getName();
            }

        }
        System.out.println( this.getName() + " finishes race");
    }
}

class TVS extends Thread{
    public void run(){
        for(int i = 0;i <= Rules.TOTAL_LAPS; i++){
            System.out.println(this.getName() + " completes " +  i + " laps ");

            try{Thread.sleep(1500);
            }catch(InterruptedException e){ 
                System.out.println(this.getName() + "Skids... but gets back up");
            }
            if(Rules.TOTAL_LAPS==i && Rules.first=="NULL")
            {
                System.out.println(this.getName()+ " Wins the race");
                Rules.first=this.getName();
            }
        }

        System.out.println( this.getName() + " finishes race");
        
    }
}

class Honda extends Thread{
    public void run(){
        for(int i = 0;i <= Rules.TOTAL_LAPS; i++){
            System.out.println(this.getName() + " completes " +  i + " laps ");

            try{Thread.sleep(1010);
            }catch(InterruptedException e){ 
                System.out.println(this.getName() + "Skids... but gets back up");
            }
            if(Rules.TOTAL_LAPS==i  && Rules.first=="NULL")
            {
                System.out.println(this.getName()+ " Wins the race");
                Rules.first=this.getName();
            }

        }
        
        System.out.println( this.getName() + " finishes race");
    }
}




public class MotoGP {
    public static void main(String[] args){
        Suzuki suszuki = new Suzuki();
        TVS tvs = new TVS();
        Honda honda = new Honda();

        suszuki.setName("Gixer");
        tvs.setName("Apache");
        honda.setName("Hornet");

        tvs.setPriority(Thread.MAX_PRIORITY);
        honda.setPriority(8);
        // suszuki.setPriority(Thread.MIN_PRIORITY);

        tvs.start();
        try{
            tvs.sleep(15000);
            System.out.println("inside sleep");

        
        }catch(InterruptedException e){
            e.printStackTrace();
            System.out.println("inside Catch");

        }
        suszuki.start();
        honda.start();
        
        System.out.println("Thread Priorities");
        System.out.println("Apache's Priority: " + tvs.getPriority());
        System.out.println("Gixers's Priority: " + suszuki.getPriority());
        System.out.println("Hornet's Priority: " + honda.getPriority());

        System.out.println("Thread under execution " + Thread.currentThread().getName());

        try{
            suszuki.join();
            honda.join();
            tvs.join();
        }catch(InterruptedException e){

        }

        System.out.println("Race complete");
        
        



    }
    

    

}
