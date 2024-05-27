package W3;

public class Employee extends Person {
    double salary;

    /*
     * public Employee(String name, String address, double salary) {
     *      this.name = name;
     *      this.address = address;
     *      this.salary = salary
     * }
     * 
     * The function above is the same as the function below
     * 
     * public Employee(String name, String address, double salary) {
     *      super();
     *      this.name = name;
     *      this.address = address;
     *      this.salary = salary;
     * }
     * 
     * Thus, make sure that the super class has a empty constructor.
     * Note: you must also call the super constructor before setting the values of the field in the child constructor
     */

    public Employee(String name, String address, double salary) {
        super(name, address); // This line is the constructor from Person with name and address as arguments
        this.salary = salary;
    }

    // Overriding is when you define the same function with the same signature and return type in a subclass
    // The @Override helps identify the overridden functions
    @Override
    public void foo() {
        System.out.println("foo in Employee");
    }

    public void bar() {
        super.foo();
        System.out.println("bar in Employee");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
