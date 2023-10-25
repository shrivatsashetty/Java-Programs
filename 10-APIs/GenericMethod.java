

class ShoutThings<T, V extends Object >{
    
    T thingToShout;
    V comment;

    public ShoutThings(T thingToShout, V comment){
        this.comment = comment;
        this.thingToShout = thingToShout;
    }

    public void shout(){
        System.out.println(this.thingToShout + " " +  this.comment + " !!!! ");
    }
}


public class GenericMethod{

    public static void main(String[] args){

        ShoutThings <String, String> shoutAtPerson = new ShoutThings<>("Adam", "is a good Boy!!");

        String commentOnZero = "Zero was discovered by Indians";

        ShoutThings <Integer, String> commentOnIntegers = new ShoutThings<>(0, commentOnZero);

        shoutAtPerson.shout();

        commentOnIntegers.shout();




    }

}