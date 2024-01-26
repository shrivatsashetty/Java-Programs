/* A demo java program to bring a gear bicycle to programming */

class Bicycle{
    int topGear = 5;
    float topSpeed = 55.67f;
    int currentGear = 0;
    float currentSpeed = 23.45f;

    // a method to change the gear of the cycle
    void changeGear(int newGear){
        System.out.println("gear shifting to: " + newGear);
        this.currentGear = newGear;
    }

    // a method to slow down the cycle
    void slowDown(float reduceSpeedBy){
        System.out.println("Slowing down by: " + reduceSpeedBy);
        this.currentSpeed -= reduceSpeedBy;
    }

    // method to stop the bicycle
    void stop(){
        this.currentSpeed = 0;
    } 

    // method to print the current states of the bicycle
    void printStates(){
        System.out.println("Current Gear: " + currentGear );
        System.out.println("Current Speed: " + currentSpeed );

    }

}

class BicycleDemo{
    public static void main(String[] args){
        Bicycle hercules = new Bicycle();
        System.out.println("Top gear: " + hercules.topGear);
        hercules.printStates();
        hercules.changeGear(2);
        hercules.slowDown(2.13f);
        hercules.printStates();


    }
}