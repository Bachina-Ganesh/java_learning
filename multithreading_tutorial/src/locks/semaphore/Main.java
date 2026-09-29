package locks.semaphore;

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(
            () -> resource.readValue()
        );

        Thread t2 = new Thread(
            () -> resource.readValue()
        );

        Thread t3 = new Thread(
            () -> resource.readValue()
        );

        t1.start();
        t2.start();
        t3.start();
    }
}
