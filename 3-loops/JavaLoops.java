class JavaLoops{
    public static void main(String args[]){
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i<=5){
            System.out.println("while loop " + i);
            // a nested loop
            int n = 1;
            
            while(n<=3){
                System.out.println("nested while " + n);
                n++;
            }

            i++;
        }
        System.out.println("final values of i,j,k are  " + i + ", " + j + ", " + k );

        do{
            System.out.println("do while " + j);
            j++;
        }while(j<=5);
        System.out.println("final values of i,j,k are  " + i + ", " + j + ", " + k );

        for(k=0;k<=5;k++){
            System.out.println("Java for loop " + k);

        }
        System.out.println("final values of i,j,k are  " + i + ", " + j + ", " + k );

    }
}