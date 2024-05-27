package W1;

public class Point {
    // Data Fields
    double x;
    double y;

    // Constructors
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Methods
    public void translate(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x*x + y*y);
    }
}
