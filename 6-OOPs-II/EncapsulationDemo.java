
/* a java program to demonstrate encapsualtion of variables in java 
 * here we set private attributes for our objects and access them via public setters and getters
 * in this way we are binding our class members with class methods hence called encapsualation
*/

import java.util.Scanner;

class MoneyLocker {
    private int money = 0;
    private String pin = "1234";

    public void setMoney(int depositAmount){
        this.money += depositAmount;
    }

    /* a method to get money form account */
    public int getMoney(String enteredPin, int requestedAmount){

        if( (enteredPin == this.pin) && (requestedAmount <= this.money) ){
            this.money -= requestedAmount;
            System.out.println("Lending an amount of:" + requestedAmount + " current balance is " + this.money );
            return requestedAmount;
        }
        else if(enteredPin != this.pin){
            System.out.println("Incorrect PIN");
            return 0;
        }
        else{
            System.out.println("Insufficient balance");
            return 0;
        }
            
    }

    /* a method to reset pin */
    public void setPin(){
        Scanner pinReader = new Scanner(System.in);
        System.out.println("Enter current pin");
        String enteredPin  = pinReader.nextLine();
        
        if(enteredPin == this.pin){
            System.out.print("Enter new pin:");
            this.pin = pinReader.nextLine();
            System.out.println("PIN updated successfully");
            System.out.println("New PIN:" + this.pin);
        }
        else
            System.out.println("Incorrect PIN");
        pinReader.close();
    }


}

// main class
public class EncapsulationDemo {
    public static void main(String[] args){
        MoneyLocker moneyLocker = new MoneyLocker();

        moneyLocker.setMoney(1000);

        moneyLocker.getMoney("1234", 100);
    }
}
