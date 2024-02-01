class SuperCar{
    void fullThrottle(){
        System.out.println("The SuperCar is at max speed");
    }

    void showSpeed(double speed){
        System.out.println("Moving at speed: " + speed + "Kmph");
    }

    public static void main(String[] args){
        SuperCar ferrari = new SuperCar();
        ferrari.fullThrottle();
        ferrari.showSpeed(78.65d);
    }
}