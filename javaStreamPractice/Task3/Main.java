package javaStreamPractice.Task3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee((short) 101, "Divyansh", 50000, (byte) 5),
                new Employee((short) 102, "Neeraj", 60000, (byte) 28),
                new Employee((short) 103, "Vaibhav", 55000, (byte) 8),
                new Employee((short) 104, "Amit", 65000, (byte) 30)
        );

        EmployeeLeaveCalculator calculator = new EmployeeLeaveCalculator();

        System.out.println("Defaulter Employee IDs:");
        System.out.println(calculator.getDefaulterEmployeeIDList(employees));

        System.out.println("\nEmployee Leaves:");
        System.out.println(calculator.getNumberOfLeaves(employees));
    }
}
