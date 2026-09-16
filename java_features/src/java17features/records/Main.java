package java17features.records;


/**
 * Record are used generally provide an immutable classes
 * In records by default it provides constructor, getter, toString, equals and hashCode methods
 * If 2 records object has same data then hashcode is also same and equals method will return true
 * We can also declare normal methods and not possible to change instance fields after initialization because it is final
 * We can declare static fields and methods in records but not instance fields
 * We can also write our own constructors
 * Records can implement interface
 */
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Ganesh", 10000);
        Person person2 = new Person(2, "Ramesh", 20000);

        System.out.println(person1);
        System.out.println(person2);
        person1.display();
        person2.display();
        System.out.println(Person.count);
        person1.hello();
    }
}
