package main_methods;

public class Main {
    static void main() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread is executing : "+Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            }
            catch (InterruptedException e) {
                System.out.println(e.getMessage()+" : "+Thread.currentThread().getName());
            }
            System.out.println("Thread is completed : "+Thread.currentThread().getName());
        });

        Thread t2 = new Thread(() -> {
            while(true) {
                System.out.println("Deamon Thread is executing : "+Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                }
                catch (InterruptedException e) {
                    System.out.println(e.getMessage()+" : "+Thread.currentThread().getName());
                }
            }
        });

        t1.start();
        t2.setName("Deamon Thread");
        t2.setDaemon(true);
        t2.start();

        System.out.println("Main thread is executing : "+Thread.currentThread().getName());
//        try {
//            Thread.sleep(1500);
//        }
//        catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }
//
//        t1.interrupt();
//
//        System.out.println("Main thread is completed : "+Thread.currentThread().getName());

//        t1.join(2000);
        System.out.println("Main thread is completed : "+Thread.currentThread().getName());
    }
}
