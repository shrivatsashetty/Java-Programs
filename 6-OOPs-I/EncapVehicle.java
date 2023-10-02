class Vehicle{
    public String colour = "Red";
    private String regdNo = "KA-20-57347";

    public String giveRegdNo(){
        return regdNo;
    }

    public void setRegdNo(String newRegdNo){
        this.regdNo = newRegdNo;
    }
}

class EncapVehicle{
    public static void main(String[] args){
        Vehicle car = new Vehicle();
        // System.out.println("Regd no: " + car.regdNo); // will give an acess error
        String carRegdNo = car.giveRegdNo();
        System.out.println("calling getter");
        System.out.println("Current regd no : " + carRegdNo);

        System.out.println("After calling setter");
        car.setRegdNo("MH-23-17243");
        System.out.println("Current regd no : " + car.giveRegdNo());



    }
}