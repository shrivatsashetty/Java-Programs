/* In Java the super keyword is usually used to call the cunstructor of the parent class 
inside the constructor of the child class */

class Parent{
    String name;
    int age;
    // constructor method of the parent class
    Parent(String name, int age){
        this.name = name;
        this.age = age;
    }

    void showDetails(){
        System.out.println("Details:");
        System.out.println("Name : " + this.name);
        System.out.println("age: " + " " + this.age);
    }
}

class Child extends Parent{
    long phoneNumber;

    Child(String name, int age, long phoneNumber){
        super(name, age);
        this.phoneNumber = phoneNumber;
        
    }

    void showDetails(){
        System.out.print("Child object ");
        // implementing a method of parent class using super keyword
        super.showDetails();
        System.out.println("Phone number: " + " " + this.phoneNumber);
    }
        
}

class SuperKeywordDemo{
    public static void main(String[] args){
        Parent ashok = new Parent("Ashok Shetty", 53);
        Child siri = new Child("Shrivatsa A Shetty", 22, 997271l);

        ashok.showDetails();
        siri.showDetails();
    }

}