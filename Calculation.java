# PracticeTest
abstract class Shape {
    abstract double calculateArea();
}


class Circle extends Shape {
     double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement the calculateArea method to calculate the area of a circle
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Define a Rectangle class that inherits from Shape and implements calculateArea
class Rectangle extends Shape {
     double width;
     double height;

    // Constructor to initialize width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implement the calculateArea method to calculate the area of a rectangle
    double calculateArea() {
        return width * height;
    }
}

/
 class Calculation {
    public static void main(String[] args) {
        
        Circle circle = new Circle(5);
        
        
        System.out.println("Circle area = " + circle.calculateArea());

        
        Rectangle rectangle = new Rectangle(3, 4);
        
        
        System.out.println("Rectangle area = " + rectangle.calculateArea());
    }
}
