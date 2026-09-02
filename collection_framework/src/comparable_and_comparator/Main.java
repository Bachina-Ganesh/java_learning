package comparable_and_comparator;

import java.util.Arrays;

public class Main {
    static void main() {
        Employee e1 = new Employee(1, "Alice", 50000);
        Employee e2 = new Employee(2, "Bob", 10000);
        Employee e3 = new Employee(3, "Carl", 80000);
        Employee e4 = new Employee(4, "Dan", 20000);

        Employee[] employees = {e3, e1, e4, e2};

        for(Employee e: employees){
            System.out.println(e);
        }

        System.out.println("--------------------------------");

        Arrays.sort(employees, (e11, e22) -> Double.compare(e11.getSalary(), e22.getSalary()));
        for(Employee e: employees){
            System.out.println(e);
        }
    }
}
