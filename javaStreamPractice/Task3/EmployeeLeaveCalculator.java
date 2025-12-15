package javaStreamPractice.Task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EmployeeLeaveCalculator {
    public List<Short> getDefaulterEmployeeIDList(List<Employee> employeeList) {
            return employeeList.stream()
                    .filter(emp->emp.getNumOfLeaves()>25)
                    .peek(e->e.setSalary(e.getSalary()*0.99))
                    .map(Employee::getEmployeeId)
                    .distinct()
                    .collect(Collectors.toList());
    }
    public ArrayList<String> getNumberOfLeaves(List<Employee> employeeList) {
        return employeeList.stream()
                .sorted(Comparator.comparingInt(Employee::getNumOfLeaves))
                .map(e->e.getName()+"-"+e.getNumOfLeaves())
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
