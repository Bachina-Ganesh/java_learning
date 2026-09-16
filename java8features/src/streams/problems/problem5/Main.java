package streams.problems.problem5;

import streams.problems.problem4.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        List<streams.problems.problem4.Employee> employees = new ArrayList<>();
        employees.add(new streams.problems.problem4.Employee(1, "Alice", 50000, "IT", List.of("Java", "Python", "Java", "Python")));
        employees.add(new streams.problems.problem4.Employee(2, "Bob", 60000, "HR", List.of("Communication", "Recruitment")));
        employees.add(new streams.problems.problem4.Employee(3, "Charlie", 70000, "IT", List.of("Java", "C++")));
        employees.add(new streams.problems.problem4.Employee(4, "David", 80000, "Finance", List.of("Accounting", "Excel")));
        employees.add(new Employee(5, "Eve", 90000, "IT", List.of("Python", "JavaScript")));


        double averageSalary = employees.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));
//        System.out.println(averageSalary);

        double averageItSalary = employees.stream()
                .filter(emp -> emp.getDepartment().equals("IT"))
                .collect(Collectors.averagingDouble(Employee::getSalary));
//        System.out.println(averageItSalary);

        double avgGreaterThan80 = employees.stream()
                .filter(emp -> emp.getSalary() > 80000)
                .collect(Collectors.averagingDouble(Employee::getSalary));
//        System.out.println(avgGreaterThan80);

        double avgBonus = employees.stream()
                .collect(Collectors.averagingDouble(emp -> emp.getSalary() * 0.1));
//        System.out.println(avgBonus);

        double avgSkills = employees.stream()
                .collect(Collectors.averagingInt(emp -> emp.getSkills().size()));
//        System.out.println(avgSkills);

        double avgTrainingCost = employees.stream()
                .collect(Collectors.averagingInt(emp -> emp.getSkills().size() * 2000));
        System.out.println(avgTrainingCost);
    }
}
