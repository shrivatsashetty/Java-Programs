class Bicycle{
    int topGear = 5;
    float topSpeed = 55.67f;
    int currentGear = 0;
    float currentSpeed = 23.45f;

    void changeGear(){
        this.currentGear++;
    }
    void slowDown(){
        this.currentSpeed -= 3.5f;
    }

    void stop(){
        this.currentSpeed = 0;
    } 

    void printStates(){
        System.out.println("Current Gear: " + this.currentGear );
        System.out.println("Current Speed: " + this.currentSpeed );

    }

}