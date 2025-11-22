package javaStreamsExtended;

public class Employee {
    private int salary;
    private final String name;
    private final Address address;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
        this.address = null;
    }

    public Employee(int salary, String name, Address address) {
        this.salary = salary;
        this.name = name;
        this.address = address;
    }

    public int getSalary() {
        return this.salary;
    }

    public String getName() {
        return this.name;
    }

    public Address getAddress() {
        return this.address;
    }

    public Employee setSalary(int salary) {
        this.salary = salary;
        return this;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}