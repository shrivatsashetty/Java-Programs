class Square{
    public double side;
    public double diagonal;
    public double area;

    // constructor
    Square(double side){
        this.side = side;
        this.diagonal = side * Math.sqrt(2);
    }

    double calcuateArea(){
        this.area = Math.pow(this.side, 2);
        return this.area;
    }

}