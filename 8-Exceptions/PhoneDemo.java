/* A Java program to demonstrate the use of static variable and static methods in java */

class Phone{
    static String brand; // this attribute now belongs to the class itself
    String phoneId;
    String name;
    int price;
    
    public void showSpecs(){
        System.out.println("Brand :" + brand + "\nphoneId: " + this.phoneId); // since brand is a class variable we do not use this keyword
        System.out.println("Phone name: " + this.name + "\nPrice: " + this.price + "\n");
        
        }
        /* lets create a static method: 
           A static method takes in an object as argument if it has to acess the instance variables
           because it would avoid confusion of which objects instance variable to acess
        */ 
    public static void showDetails(Phone phone){
        System.out.println("\nPrinting details from a static method");
        System.out.println("Brand: " + brand + "  phone_name : " + phone.name);

    } 
}

class PhoneDemo{
    public static void main(String[] args){

        Phone phone1 = new Phone();
        Phone.brand = "Apple"; // We directly use the ClassName to acess the value of a static variable 
        phone1.phoneId = "Phone 1";
        phone1.name = "iPhone 13 ";
        phone1.price = 67000;
        phone1.showSpecs();

        Phone phone2 = new Phone();
        /* object phone2 is changing the value of static variable 'brand', 
           the changes will also get reflected for brand attribute of  phone2 */
        Phone.brand = "Samsung"; 
        phone2.phoneId = "Phone 2";
        phone2.name = "Galaxy S23 Ultra ";
        phone2.price = 100000;
        phone2.showSpecs();

        phone1.showSpecs(); // now we can see that the brand attribute of phone2 has also changed

        /* To call the static method we use the class names directly instead of object names */
        Phone.showDetails(phone1); // prints the attributes of phone1
        Phone.showDetails(phone2); // prints the attributes of phone1

        

        


    }
}