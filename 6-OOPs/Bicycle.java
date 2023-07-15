class Bicycle{
    int topGear = 5;
    float topSpeed = 55.67f;
    int currentGear = 0;
    float currentSpeed = 23.45f;

    void changeGear(){
        currentGear++;
    }
    void slowDown(){
        currentSpeed -= 3.5f;
    }

    void stop(){
        currentSpeed = 0;
    } 

    void printStates(){
        System.out.println("Current Gear: " + currentGear );
        System.out.println("Current Speed: " + currentSpeed );

    }

}