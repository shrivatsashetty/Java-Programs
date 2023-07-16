/*  program to demonstrate multiple inheritence in java */
interface Flyable{
    public void fly();
}

interface Swimmer{
    public void swim();
}

class WaterBirds implements Flyable, Swimmer{
    public void fly(){
        System.out.println("Flying.....");
    }

    public void swim(){
        System.out.println("Swimming.....");
    }
    
    public static void main(String[] args){
        WaterBirds duck = new WaterBirds();
        duck.swim();
        duck.fly();
    }
}

