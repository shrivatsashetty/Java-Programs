class Square{
    public double side;
    public double diagonal;
    private double area;

    // constructor
    Square(double side){
        this.side = side;
        this.diagonal = side * Math.sqrt(2);
    }

    double calcuateArea(double side){
        this.area = side * Math.sqrt(2);
        return this.area;
    }

}