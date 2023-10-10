public class ProducerConsumer {
    
    class Rescource{

        public final int MAX_SIZE = 10;
        public final int MIN_SIZE = 3;
        
        public int currentSize;
        
        public int produce() {
            if(currentSize < MAX_SIZE){
                this.currentSize++;
            }
            return currentSize;
            
        }
        
        public int consume() {
            if(currentSize > MIN_SIZE){
                this.currentSize--;
            }
            return currentSize;
        }
        
    }
    
    class Producer extends Rescource implements Runnable{
        public void run(){
            if(currentSize < MAX_SIZE){
                produce();
            }
        }
    }
    

}
