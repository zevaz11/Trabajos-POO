import Shapes.Circle;
import Shapes.Square;
import Shapes.Triangle;

public class MainShapes {
    public static void main(String[] args) {
        //shapes
        Square square1 = new Square(10,10,10,10);
        Circle circle1 = new Circle(5);
        Triangle triangle1 = new Triangle(7,10,2,5);
        //information
        System.out.println("-- Square -- \nArea: " + square1.calculateArea() + "\nPerimeter "+ square1.calculatePerimeter());
        System.out.println("\n-- Circle -- \nArea: " + circle1.calculateArea() + "\nPerimeter "+ circle1.calculatePerimeter());
        System.out.println("\n-- Triangle -- \nArea: " + triangle1.calculateArea() + "\nPerimeter "+ triangle1.calculatePerimeter());
    }
}