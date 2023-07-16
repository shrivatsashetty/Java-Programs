class SquareMain{
    public static void main(String[] args){
        Square sq1 = new Square(4.0);
        System.out.println("side of square: " + sq1.side);
        sq1.calcuateArea();
        System.out.println("Area of the squre is: " + sq1.area);
    }
}