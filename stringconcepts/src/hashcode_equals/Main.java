package hashcode_equals;

public class Main {
    static void main() {
        Employee e1 = new Employee(1, "Ganesh");
        Employee e2 = new Employee(1, "Ganesh");

        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println(s1.equals(s2));
        System.out.println(e1.equals(e2));


    }
}
