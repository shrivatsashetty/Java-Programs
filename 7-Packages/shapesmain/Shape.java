package shapesmain;

import shapes.Square;
import shapes.Triangle;


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
