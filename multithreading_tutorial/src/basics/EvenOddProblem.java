package basics;

public class EvenOddProblem {
    static void main() throws InterruptedException {
        Thread oddThread = new Thread(() -> {
            for(int i=1; i<=30; i+=2) {
                System.out.println("Odd: " + i);
                try {
                    Thread.sleep(3000);
                }catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        Thread evenThread = new Thread(() -> {
            for(int i=2; i<=30; i+=2) {
                System.out.println("Even: " + i);
                try {
                    Thread.sleep(3000);
                }catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        oddThread.start();
        Thread.sleep(100); // Small delay to ensure oddThread starts first
        evenThread.start();

        oddThread.join();
        evenThread.join();

        System.out.println("Main thread completed");
    }
}
