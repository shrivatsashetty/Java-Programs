

class BicycleDemo{
    public static void main(String[] args){
        Bicycle hercules = new Bicycle();
        System.out.println("Top gear: " + hercules.topGear);
        hercules.printStates();
        hercules.changeGear();
        hercules.slowDown();
        hercules.printStates();


    }
}