
class Car{

    String model = "Random Model";
    int topSpeed = 200;
    long regdNo = 1234567l;

    // default construvtor with no arguments
    public Car(){
        
    } 

    // constructor with a single argument
    public Car(String model){
        this.model = model;
    } 

    // constructor with two arguments
    public Car(String model, int topSpeed){
        this.model = model;
        this.topSpeed = topSpeed;
    }

    // constructor with three arguments
    public Car(String model, int topSpeed, long regdNo){
            this.model = model;
            this.topSpeed = topSpeed;
            this.regdNo = regdNo;
        }

    public void showCarSpecs(){
        System.out.println("Model: " + this.model);
        System.out.println("Top Sped: " + this.topSpeed);
        System.out.println("Regd No: " + this.regdNo);
        
    }

}

public class ConstructorOverload {
    public static void main(String[] args){
        Car car0 = new Car();
        Car car1 = new Car("Mercedes" );
        car0.showCarSpecs();
        System.out.println("\n");
        car1.showCarSpecs();
        System.out.println("\n");
        
        
    }
}
