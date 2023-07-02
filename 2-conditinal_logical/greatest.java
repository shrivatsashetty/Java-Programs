// java program to print the greates amoung the three numbers

class greatest{
    public static void main(String args[]){
        int a = 3;
        int b = 7;
        int c = 1;
        System.out.println("Amoung " + a + "," + b + "," + c );
        if(a >= b && a>=c){
            System.out.print(a);
        }
            
        else if(b>=a && b>=c){
            System.out.print(b);
        }
        else if(c>=a && c>=b){
            System.out.print(c);
        }
        else{System.out.print("all are equal");}
        System.out.println(" is greatest");
    }

}