package locks.lock_free_mechanisim;

public class Main {
    public static void main(String[] args) {
        // Counter counter = new Counter(0);
        LockFreeCounter counter = new LockFreeCounter();

        Thread t1 = new Thread(
            () -> {
                for(int i=0; i<10000; i++) {
                    counter.increment();
                }
            }
        );

        Thread t2 = new Thread(() -> {
            for(int i=0; i<10000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Count is : "+counter.getCount());
    }
}
