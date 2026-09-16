package thread_lifecycle;

public class Main {
    static void main() {
        Thread t1 = new Thread(() -> {

        });

        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t1.getState());
    }
}
