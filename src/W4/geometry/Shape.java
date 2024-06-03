package W4.geometry;

/*
 * Note: the "new" keyword means that we are allocating memory in the heap
 * Note: an abstract class cannot be inistated using the new keyword
 * Note: if you have an abstract method, the class should be abstract
 * Note: abstract methods are methods that are common to all subclasses but the implemenation is different
 * Note: once you create an abstract method, each subclass will be forced to implement the method
 */

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double computeArea();

}
