import shapes.Square; // to import only certian class
import shapes.*;      // to import all classes in the package

public class ShapesMain {
    public static void main(String[] args) {
        Square square = new Square(5.0);
        Triangle triangle = new Triangle(2.0, 3.0, 4.0);
        Circle circle = new Circle(0);

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
