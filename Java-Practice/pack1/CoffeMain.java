package pack1;

class Coffe{
    public String taste = "sweet";
    public String type = "capucino";

    public void drinkCoffe(){
        System.out.println("Drinking coffe.....");
    }

    

}

class CoffeMain{
    public static void main(String[] args){
        Coffe c1 = new Coffe();
        c1.drinkCoffe();
    } 
}