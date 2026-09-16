package streams.problems.problem2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static void main() {

        List<Employee> employees = List.of(
                new Employee("Alice", "HR", 50000),
                new Employee("Bob", "IT", 60000),
                new Employee("Charlie", "Finance", 70000),
                new Employee("David", "IT", 80000),
                new Employee("Eve", "HR", 90000)
        );

//        Optional<Employee> firstEmp = employees.stream().filter(emp -> emp.getSalary() > 50000).findFirst();
//        System.out.println("First employee with salary greater than 50000: " + firstEmp.orElse(null));

//        List<Employee> highestPaidEmployees = employees.stream()
//                .sorted(Comparator.comparing(Employee::getSalary).reversed())
//                .limit(2).toList();
//        System.out.println(highestPaidEmployees);

//        List<Employee> sorted = employees.stream()
//                .sorted((e1, e2) -> {
//                    if (e1.getSalary() > e2.getSalary()) {
//                        return 1;
//                    } else if (e1.getSalary() < e2.getSalary()) {
//                        return -1;
//                    } else {
//                        return e1.getName().compareTo(e2.getName());
//                    }
//                }).toList();
//        System.out.println(sorted);


//        Map<String, Long> deptGroup = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
//        System.out.println(deptGroup);

//        Map<String, List<String>> deptEmpNames = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
//        System.out.println(deptEmpNames);

//        Map<String, Double> collect = employees.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
//        System.out.println(collect);

//        Map<String, Double> collect = employees.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
//        System.out.println(collect);

//        Map<String, Optional<Employee>> collect = employees.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
//        System.out.println(collect);
//        Map<String, Employee> collect1 = employees.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment,
//                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Optional::get)));
//        System.out.println(collect1);

//        String collect = employees.stream()
//                .map(Employee::getName)
//                .collect(Collectors.joining(", "));
//        System.out.println(collect);

//        Map<String, String> collect = employees.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.joining(", "))));
//        System.out.println(collect);

        List<String> names = employees.parallelStream()
                .map(emp-> {
                    System.out.println(Thread.currentThread().getName()+" "+emp.getName());
                    return emp.getName();
                })
                .toList();
        System.out.println(names);
    }
}
