package W4;

public class Person {
    private String name;
    private String address;

    // The two constructors is an example of method overloading
    // Overloading: defining a method with the same name but different signatures

    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // If the argument is Person other, then this will not be overriding as the equals functions takes in an Object type
    @Override
    public boolean equals(Object obj) {
        // Always check if obj is null
        if (obj == null) {
            return false;
        }

        // Check the type of obj
        if (!(obj instanceof Person)) {
            return false;
        }

        Person other = (Person) obj;

        return name.equals(other.name) && address.equals(other.address);
    }

    // Requirement: When having a hashCode method, if 2 objects are equal (using .equals) then the hashCode must be the same
    // Key Idea: Avoid mapping the many objects to the same hashCode
    // There is no perfect hashCode as the number of objects > number of ints
    @Override
    public int hashCode() {
        return 11 * name.hashCode() * 13 * address.hashCode();
    }

    @Override
    public String toString() {
        return "name: " + name + ", " + address;
    }
}
