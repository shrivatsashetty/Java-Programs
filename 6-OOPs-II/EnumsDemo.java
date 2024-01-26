enum TrafficLights{
    RED,
    YELLOW,
    GREEN
}

class EnumsDemo{

        // A method outside main() method
        public static boolean stop(TrafficLights light){
            if(light == TrafficLights.RED){
                // System.out.println("The traffic light is RED")
                return true;
            }  
            else
                return false;

        }

    public static void main(String[] args){
        TrafficLights light = TrafficLights.YELLOW; 

        if (stop(TrafficLights.YELLOW)) // YELLOW is a static variable which needs to be acessed  in a static
            System.out.println("It's time to stop and wait.");
        else
            System.out.println("You can go.");

        System.out.println("The traffic light is " + light);

        switch(light){
            case RED:
                System.out.println("Stop...");
                break;
            case YELLOW:
                System.out.println("Wait...");
                break;
            case GREEN:
                System.out.println("Go...");
                break;
            default:
                System.out.println("No light blinking.");
        }     
    }   
}

