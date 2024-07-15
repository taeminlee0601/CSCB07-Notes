import W10.*;

public class W10_Notes {
    public static void main(String[] args) {

    }

    public static void testRectangleArea(Rectangle r) {
        r.setWidth(5);
        r.setLength(4);
        // assertTrue(r.getArea() == 20)

        // r.getArea() will not return 20 but to the user
        // it is not evident as they do not know the 
        // implementation of the Rectangle and Square classes
    }

    // Showing an assumption that can be made
    public static void example1() {
        Rectangle r = new Square(1);
        testRectangleArea(r);
    }
}
