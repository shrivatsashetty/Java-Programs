class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }
}

class Triangle {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class Shape {
    public static void main(String[] args) {
        Square square = new Square(5.0);
        Triangle triangle = new Triangle(2.0, 3.0, 4.0);
        Circle circle = new Circle(2.5);

        double squareArea = square.calculateArea();
        double squarePerimeter = square.calculatePerimeter();
        double triangleArea = triangle.calculateArea();
        double trianglePerimeter = triangle.calculatePerimeter();
        double circleArea = circle.calculateArea();
        double circleCircumference = circle.calculateCircumference();

        System.out.println("Square:");
        System.out.println("Area: " + squareArea);
        System.out.println("Perimeter: " + squarePerimeter);

        System.out.println("Triangle:");
        System.out.println("Area: " + triangleArea);
        System.out.println("Perimeter: " + trianglePerimeter);

        System.out.println("Circle:");
        System.out.println("Area: " + circleArea);
        System.out.println("Circumference: " + circleCircumference);
    }
}
