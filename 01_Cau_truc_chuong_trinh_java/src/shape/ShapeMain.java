package shape;

public class ShapeMain {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);

        System.out.println("shape.Circle Area: " + circle.calculateArea());
        System.out.println("shape.Circle Perimeter: " + circle.calculatePerimeter());

        Rectangle rectangle = new Rectangle(4.0, 6.0);

        System.out.println("shape.Rectangle Area: " + rectangle.calculateArea());
        System.out.println("shape.Rectangle Perimeter: " + rectangle.calculatePerimeter());

        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        System.out.println("shape.Triangle Area: " + triangle.calculateArea());
        System.out.println("shape.Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}
