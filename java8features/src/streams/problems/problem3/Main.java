package streams.problems.problem3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    static void main() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", 50000.0));
        employees.add(new Employee(2, "Bob", 10000.0));
        employees.add(new Employee(3, "Carl", 50000.0));

        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName).reversed())
                .forEach(employee -> System.out.println(employee.getName() + " - " + employee.getSalary()));
    }
}
