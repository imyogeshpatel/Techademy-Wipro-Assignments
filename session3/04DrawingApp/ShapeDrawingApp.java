abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Main class to test polymorphism
public class ShapeDrawingApp {
    public static void main(String[] args) {
        // Creating an array of Shape references
        Shape[] shapes = new Shape[4];

        // Storing different shapes in the array
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Circle();
        shapes[3] = new Rectangle();

        // Using polymorphism to call the draw method
        for (Shape shape : shapes) {
            shape.draw(); // Calls the appropriate draw() method based on runtime object
        }
    }
}