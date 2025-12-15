package javaStreamPractice.Task3;

import java.util.Objects;

public class Employee {
    private final short employeeId;
    private final String name;
    private double salary;
    private byte numOfLeaves;

    public Employee(short employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public Employee(short employeeId, String name, double salary, byte numOfLeaves) {
        this.salary=salary;
        this.employeeId = employeeId;
        this.name = name;
        this.numOfLeaves=numOfLeaves;
    }

    public short getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public byte getNumOfLeaves() {
        return numOfLeaves;
    }

    public void setNumOfLeaves(byte numOfLeaves) {
        this.numOfLeaves = numOfLeaves;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId && Double.compare(salary, employee.salary) == 0 && numOfLeaves == employee.numOfLeaves && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, name, salary, numOfLeaves);
    }

    @Override
    public String toString() {
        return "EmployeeLeaveCalculator{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", numOfLeaves=" + numOfLeaves +
                '}';
    }
}
