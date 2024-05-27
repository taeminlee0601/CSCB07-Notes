import W3.*;

public class W3_Notes {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
        example4();
        example5();
        example6();
        example7();
    }

    public static void example1() {
        System.out.println("Example 1");
        Employee e = new Employee("Taemin", "Toronto", 1000);
        System.out.println(e.getName());
        System.out.println();
    }

    public static void example2() {
        System.out.println("Example 2");
        Person p = new Person("Taemin", "Toronto");
        // System.out.println(p.getSalary);
        // The line above will be an error because p is a Person type thus does not have salary
        System.out.println();
    }

    public static void example3() {
        System.out.println("Example 3");
        Person p = new Employee("Taemin", "Toronto", 1000);
        p.foo();
        // Need to know runtime type to know which function is running (Dynamic Binding)
        // 1. Goes through the runtime type of p (Employee)
        // 2. Check if foo is a method in Employee. If yes, run foo. If not, go to next step
        // 3. Check if foo is a method in the super class, Person. If yes, run foo.
        System.out.println();
    }

    public static void example4() {
        System.out.println("Example 4");
        Person p = new Employee("Taemin", "Toronto", 1000);

        // If the runtime type of the object p is Employee or any of its subclasses then this condition is true
        if (p instanceof Employee) {
            System.out.println("p is an Employee");
        }
        System.out.println("p is a Person");
        System.out.println();
    }

    public static void example5() {
        System.out.println("Example 5");
        Person p = new Employee("Taemin", "Toronto", 1000);
        Employee e = (Employee)p;
        System.out.println(e.getSalary());

        Person p1 = new Person("Taemin", "Toronto");
        // Employee e1 = (Employee) p1;
        // This cannot be casted as the Person is a superclass of employee thus missing important information needed for Employee
        // System.out.println(e1.getSalary());
        // This line will cause an error as you cannot downcast from super to subclass and call a method exclusive to the subclass
        System.out.println();
    }

    public static void example6() {
        System.out.println("Example 6");
        Employee e = new Employee("Taemin", "Toronto", 1000);
        e.bar();
        System.out.println();
    }

    public static void example7() {
        System.out.println("Example 7");
        Person p1 = new Person("Taemin", "Toronto");
        Person p2 = new Person("Taemin", "Toronto");

        // This if condition checks if the addresses of the objects (in the heap) are the same
        if (p1 == p2) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }

        // If equals method is not overridden, then p1.equals(p2) is the same as p1 == p2
        if (p1.equals(p2)) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }

        System.out.println();
    }
}
