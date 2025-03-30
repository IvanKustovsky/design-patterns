import java.util.HashMap;
import java.util.Map;

// Prototype Interface
interface Shape extends Cloneable {
    Shape clone();
    void draw();
}

// Concrete Prototype 1: Circle
class Circle implements Shape {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Circle(radius, color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle with radius " + radius);
    }
}

// Concrete Prototype 2: Rectangle
class Rectangle implements Shape {
    private int width;
    private int height;
    private String color;

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Rectangle(width, height, color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " rectangle of size " + width + "x" + height);
    }
}

// Prototype Registry
class ShapeRegistry {
    private final Map<String, Shape> shapes = new HashMap<>();

    public void addShape(String key, Shape shape) {
        shapes.put(key, shape);
    }

    public Shape getShape(String key) {
        Shape shape = shapes.get(key);
        return shape != null ? shape.clone() : null;
    }
}

// Client Code
public class Main {
    public static void main(String[] args) {
        ShapeRegistry registry = new ShapeRegistry();

        // Adding prototypes to the registry
        registry.addShape("big red circle", new Circle(10, "red"));
        registry.addShape("small blue rectangle", new Rectangle(5, 3, "blue"));

        // Cloning shapes
        Shape clonedCircle = registry.getShape("big red circle");
        Shape clonedRectangle = registry.getShape("small blue rectangle");

        clonedCircle.draw();       // Output: Drawing a red circle with radius 10
        clonedRectangle.draw();     // Output: Drawing a blue rectangle of size 5x3
    }
}