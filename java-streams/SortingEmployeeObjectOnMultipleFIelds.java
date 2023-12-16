import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingEmployeeObjectOnMultipleFIelds {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Shreya", 26);
        Employee emp2 = new Employee(2, "Minni", 26);
        Employee emp3 = new Employee(3, "Pars", 11);

        var empList = List.of(emp2, emp3, emp1);

        // Creating comparator object
        System.out.println("Sorted using comparator object");
        empList.stream()
            .sorted(new Comparator<Employee>() {
                @Override
                public int compare(Employee e1, Employee e2) {
                    return e1.getId().compareTo(e2.getId());
                }
            }).forEach(System.out::println);

        // Using comparator in streams on multiple fields
        System.out.println("\nSorted using comparator on multiple fields");
        empList.stream()
            .sorted(Comparator.comparingInt(Employee::getAge)
                    .thenComparingInt(Employee::getId))
            .forEach(System.out::println);
    }
}

class Employee {
    Integer id;
    String name;
    Integer age;

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}