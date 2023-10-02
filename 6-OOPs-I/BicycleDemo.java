class Bicycle{
    int topGear = 5;
    float topSpeed = 55.67f;
    int currentGear = 0;
    float currentSpeed = 23.45f;

    void changeGear(int newGear){
        System.out.println("gear shifting to: " + newGear);
        currentGear = newGear;
    }
    void slowDown(float cutSpeedBy){
        System.out.println("Slowing down by: " + cutSpeedBy);
        currentSpeed -= cutSpeedBy;
    }

    void stop(){
        currentSpeed = 0;
    } 

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