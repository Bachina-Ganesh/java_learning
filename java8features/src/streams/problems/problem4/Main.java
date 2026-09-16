package streams.problems.problem4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", 50000, "IT", List.of("Java", "Python")));
        employees.add(new Employee(2, "Bob", 60000, "HR", List.of("Communication", "Recruitment")));
        employees.add(new Employee(3, "Charlie", 70000, "IT", List.of("Java", "C++")));
        employees.add(new Employee(4, "David", 80000, "Finance", List.of("Accounting", "Excel")));
        employees.add(new Employee(5, "Eve", 90000, "IT", List.of("Python", "JavaScript")));

        double totalSalary = employees.stream()
                .collect(Collectors.summingDouble(Employee::getSalary));
//        System.out.println(totalSalary);

        double totalItSalary = employees.stream()
                .filter(emp -> emp.getDepartment().equals("IT"))
                .collect(Collectors.summingDouble(Employee::getSalary));
//        System.out.println(totalItSalary);

        double totalSalaryGreaterThan80 = employees.stream()
                .filter(emp -> emp.getSalary() > 80000)
                .collect(Collectors.summingDouble(Employee::getSalary));
//        System.out.println(totalSalaryGreaterThan80);

        long totalSkills = employees.stream()
                .filter(emp -> emp.getDepartment().equals("IT"))
                .flatMap(emp -> emp.getSkills().stream())
                .distinct()
                .count();

//        System.out.println(totalSkills);

        double sum = employees.stream()
                .mapToDouble(emp -> emp.getSalary() * 0.1 + emp.getSalary())
                .sum();
//        System.out.println(sum);

        Double collectSum = employees.stream()
                .collect(Collectors.summingDouble(emp -> emp.getSalary() * 0.1 + emp.getSalary()));
//        System.out.println(collectSum);



    }
}
