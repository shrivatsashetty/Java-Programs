class ArrayCopyDemo{
    public static void main(String[] args){
        String[] capitalCities = {"Bangalore", "Panaji", "Chennai"};
        String capitalsCopy[] = new String[3];
        System.arraycopy(capitalCities, 1, capitalsCopy, 0, 2);
        System.out.println(capitalsCopy.length);
        for(int i = 1; i<=capitalsCopy.length; i++){
            System.out.println(capitalsCopy[i-1]);
        }
    }
}