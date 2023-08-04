package pack1;

class Coffee{
    public String taste = "sweet";
    public String type = "capucino";

    public void drinkCoffe(){
        System.out.println("Drinking coffe.....");
    }

    

}

class CoffeMain{
    public static void main(String[] args){
        Coffee c1 = new Coffee();
        c1.drinkCoffe();
    } 
}