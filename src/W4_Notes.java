import W4.*;
import W4.geometry.*;

public class W4_Notes {
    public static void main(String[]args) {
        example1();
        example2();
        example4();
    }

    // toString() example
    public static void example1() {
        System.out.println("toString() Example");
        Person p1 = new Person("taemin", "UTSC");

        // System.out.println(p1) will implicitly call the toString method
        System.out.println(p1.toString());
        System.out.println();
    }

    public static void foo(Person p) {
        System.out.println("This is a Person: " + p);
    }

    // Example of dynamic binding
    public static void bar(Employee e) {
        // If no toString() method is defined in Employee, it will use the toString() method of its super class.
        System.out.println("This is an Employee: " + e);
    }

    public static void example2() {
        System.out.println("Polymorphism Example");

        Person p1 = new Person("taemin", "UTSC");
        Employee e1 = new Employee("paul", "UTSC", 1000);
        
        foo(p1);
        bar(e1);
        foo(e1);

        System.out.println();
    }

    public static void example3() {
        System.out.println("Encapsulation Example");
        
        Person p1 = new Person("taemin", "UTSC");
        
        // p1.name = "t";
        // If it is not private, this field can be changed, which may lead to bugs
        // If it is private, the field cannot be changed, thus restricting access to the field -> data cannot be easily accessed

        /*
         * private Type : can be accessed by the class where its defined
         * package-private : can be access by other classes (This is the default visible when no visibility is declared)
         * protected : can be access by itself and its subclasses
         * prublic : can be access by any class
         */

        /*
         * Concept of Encapsulation
         * - Make things as inaccessible as possible
         * - API (the things that any classes can access)
         * - Other classes don't need to know about the private data 
         */

        System.out.println();
    }

    public static void example4() {
        System.out.println("Example 4");

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("red", 1);
        shapes[1] = new Rectangle("blue", 2, 3);
        shapes[2] = new Circle("green", 1);

        for (Shape shape : shapes) {
            /*
            if (shape instanceof Circle) { 
                Circle c = (Circle)shape;
                System.out.println(c.computeArea());
            }

            Need to do this for every shape object, thus, shape should be an abstract class
             */
            
            System.out.println(shape.computeArea());
        }

        System.out.println();
    }
}
