package W2;


public class Point {
	//fields
	public double x;
	public double y;
	static int count; //represents the total number of instances
	
	//methods
	public Point() {
		count++;
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
		count++;
	}
	
	public void translate(double dx, double dy) {
		x += dx;
		y += dy;
	}
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	double distanceFromOrigin() {
		return Math.sqrt(x*x + y*y);
	}
	
	public static void displayCount() {
		System.out.println("Count = " + count);
	}
}

