package java17features.records;

interface Hello {
    void hello();
}
public record Person(int id, String name, double salary) implements Hello {
    public static int count = 0;

    public Person(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        count++;
    }

    public void display() {
        System.out.println("This is a person class : "+name);
    }


    @Override
    public void hello() {
        System.out.println("Hello from Person record");
    }
}
