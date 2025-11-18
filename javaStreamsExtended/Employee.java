package javaStreamsExtended;

public class Employee {
    private final int salary;

    private final String name;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public int getSalary() {
        return this.salary;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
