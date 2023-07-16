class Car{
    void fullThrottle(){
        System.out.println("The car is at fullspeed");
    }

    void showSpeed(double speed){
        System.out.println("Moving at speed: " + speed + "Kmph");
    }

    public static void main(String[] args){
        Car ferrari = new Car();
        ferrari.fullThrottle();
        ferrari.showSpeed(78.65d);
    }
}