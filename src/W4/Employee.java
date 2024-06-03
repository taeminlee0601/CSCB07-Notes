package W4;

public class Employee extends Person {
    double salary;

    public Employee(String name, String address, double salary) {
        super(name, address); // This line is the constructor from Person with name and address as arguments
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
