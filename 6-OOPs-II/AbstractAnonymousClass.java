
abstract class KeypadPhone{

    String profile = "Silent";

    // abstract methods
    public abstract void showProfile();
    public abstract void configProfile(String profile);

}


public class AbstractAnonymousClass {
    public static void main(String[] args) {
        System.out.println();
        KeypadPhone nokiaLumia = new KeypadPhone() {

            @Override
            public void showProfile(){
                System.out.println("Current Profile: " + this.profile);
            }

            /* anonymous inner class has acess to instance variables of the orignal class 
               hence we can set their value */ 
            public void configProfile(String profile){
                this.profile = profile;
                System.out.println("New profile:" + this.profile);
            }
        };

        nokiaLumia.showProfile();
        nokiaLumia.configProfile("Meeting");
    }
}
