package executorservice_demo.thread_local_demo;

public class Main {
    public static ThreadLocal name = new ThreadLocal<>();
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            name.set("Ganesh");
            System.out.println(Thread.currentThread().getName()+" is set name to "+name.get());
            try {
                Thread.sleep(5000);
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        });

        Thread t2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+" name value is "+name.get());
            try {
                Thread.sleep(2000);
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        });

        t1.start();

        try {
            Thread.sleep(2000);
        }
        catch(Exception e) {

        }

        t2.start();
    }
}
