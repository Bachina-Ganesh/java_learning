package locks.semaphore;

import java.util.concurrent.Semaphore;

public class SharedResource {
    Semaphore semaphore = new Semaphore(2);

    public void readValue() {
        try {
            semaphore.acquire();
            System.out.println("Reading a value by "+Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Reading completed by "+Thread.currentThread().getName());
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            semaphore.release();
        }
        
    }
}
