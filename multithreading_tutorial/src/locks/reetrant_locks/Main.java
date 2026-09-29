package locks.reetrant_locks;

public class Main {
    public static void main(String[] args) {
        SharedResource sh = new SharedResource();

        Thread t1 = new Thread(
            () -> {
                try {
                    sh.deposit(100);
                } catch (InterruptedException e) {
                }
            }
        );

        Thread t2 = new Thread(
            () -> {
                try {
                    sh.deposit(200);
                } catch (InterruptedException e) {
                }
            }
        );

        t1.start();
        t2.start();
    }
}
