class ShirtSize{
    public static void main(String args[]){

        String size = "m";

        switch(size) {
            case "xs":
                System.out.println("Your shirt size is Extra Small");
                break;
            case "s":
                System.out.println("Your shirt size is Small");
                break;
            case "m":
                System.out.println("Your shirt size is Medium");
                break;
            case "l" :
                System.out.println("Your shirt size is Large");
                break;
            case "xl" :
                System.out.println("Your shirt size is Extra Large");
                break;
            case "xxl":
                System.out.println("Your shirt size is Extra Extra Large");
                break;
            default:
                System.out.println("Size not found");   
        }
    }
}