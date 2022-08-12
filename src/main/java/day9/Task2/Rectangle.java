package day9.Task2;

public class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b,String color) {
        super(color);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }
}
