
class Rescource{
    public static int bufferSize = 0;
    public static int MAX_BUFFER_SIZE = 5;
    public static int MIN_BUFFER_SIZE = 2;
}

class Producer extends Thread{
    @Override
    public void run(){
        while(!(Rescource.bufferSize <= Rescource.MIN_BUFFER_SIZE)){

            try{
                this.wait();
            }catch(InterruptedException e){

            }

            for(int i = Rescource.MIN_BUFFER_SIZE; i <= Rescource.MAX_BUFFER_SIZE; i++ ){
                Rescource.bufferSize++;
            }
                
        }
    }
}


public class ProducerConsumer {

}
