
class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    public void displayShape() {
        System.out.println("Shape: " + name);
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void displayCircle() {
        displayShape();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
    }
}


class ColoredCircle extends Circle {
    String color;

    public ColoredCircle(double radius, String color) {
        super(radius);
        this.color = color;
    }

    public void displayColoredCircle() {
        displayCircle();
        System.out.println("Color: " + color);
    }
}

public class ShapeColor {
    public static void main(String[] args) {
        ColoredCircle coloredCircle = new ColoredCircle(5.0, "Red");

        coloredCircle.displayColoredCircle();
    }
}
