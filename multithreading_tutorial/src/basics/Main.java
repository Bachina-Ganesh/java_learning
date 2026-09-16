package basics;

class Task1 extends Thread {
    @Override
    public void run() {
        System.out.println("Task1 is running");
    }
}
public class Main {
    static void main() {
        Thread thread1 = new Task1();
        thread1.start();

        Thread thread2 = new Thread(() -> {
            System.out.println("Task2 is running");
        });
        thread2.start();
    }
}
