package W4.geometry;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return Math.pow(radius,2) * 3.14;
    }
}
