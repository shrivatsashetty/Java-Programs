
 class Bike{
    protected String company = "Bajaj";
    public void throttle(){
        System.out.println("Veeeeeeeee......Veeeeeeee..");
    }
 }

class Pulsar extends Bike{
    protected float engineCapacity;

    Pulsar(float engineCC){
        this.engineCapacity = engineCC;
    }
    public void horn(){
        System.out.println("peeeep........side plzz.");
    }
    // overriding throttle method 
    public void throttle(){
        System.out.println("Vroooooom........");
    }
}

public class BikeMain{
    public static void main(String[] args){
        Pulsar pulsar200 = new Pulsar(200.0f);
        System.out.println("bike Comapany: " + pulsar200.company);
        System.out.println("Engine capacity: " + pulsar200.engineCapacity);
        pulsar200.throttle();
        pulsar200.horn();

    }
}