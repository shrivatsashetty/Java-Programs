class Bicycle{
    int topGear = 5;
    float topSpeed = 55.67f;
    int currentGear = 0;
    float currentSpeed = 23.45f;

    void changeGear(){
        this.currentGear++;
    }
    void slowDown(){
        this.currentSpeed -= 3.5;
    }

    void stop(){
        this.currentSpeed = 0;
    } 

    void printStates(){
        System.out.println("Current Gear: " + this.currentGear );
        System.out.println("Current Speed: " + this.currentSpeed );

    }

}

class BicycleDemo{
    public static void main(String[] args){
        Bicycle hercules = new Bicycle();
        System.out.println("Top gear: " + hercules.topGear);
        // System.out.println("Current Gear: " + hercules.topGear);
        hercules.printStates();
        hercules.changeGear();
        hercules.slowDown();
        hercules.printStates();


    }
}