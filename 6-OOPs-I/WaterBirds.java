/*  program to demonstrate multiple inheritence in java */
interface Flyable{
    public void fly();
}

interface Swimmer{
    public void swim();
}

class WaterBirds implements Flyable, Swimmer{

    String birdName;

    // constructor to instantiate attributes of bird 
    WaterBirds(String birdName){
        this.birdName = birdName;
    }

    public void fly(){
        System.out.println(this.birdName + " is flying.....");
    }

    public void swim(){
        System.out.println(this.birdName + " is swimming.....");
    }
    
    public static void main(String[] args){
        WaterBirds duck = new WaterBirds("Duck");
        duck.swim();
        duck.fly();
    }
}

