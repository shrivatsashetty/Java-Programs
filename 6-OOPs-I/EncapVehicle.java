/* A java program to demonstrate encapsulation or the use of acess modifiers in java
 * also demostrate the use of setter and getter methods to acess private attributes of a class
 */

class Vehicle{
    public String colour = "Red";
    private String regdNo = "KA-20-57347";

    // public getter method to fetch the value of private property
    public String getRegdNo(){
        return regdNo;
    }

    // public setter method to set the value of private variable property
    public void setRegdNo(String newRegdNo){
        this.regdNo = newRegdNo;
    }
}

class EncapVehicle{
    public static void main(String[] args){
        Vehicle car = new Vehicle();
        // System.out.println("Regd no: " + car.regdNo); // will give an acess error
        String carRegdNo = car.getRegdNo();
        System.out.println("calling getter");
        System.out.println("Current regd no : " + carRegdNo);

        System.out.println("After calling setter");
        car.setRegdNo("MH-23-17243");
        System.out.println("Current regd no : " + car.getRegdNo());

    }
}