package locks.reetrant_locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

    int amount = 1000;
    ReentrantLock lock = new ReentrantLock();

    public void deposit(int amount) throws InterruptedException {
        if(lock.tryLock(2, TimeUnit.SECONDS)) {
            try {
                this.amount += amount;
                System.out.println("Amount deposited is : "+amount);
                System.out.println("Total amount : "+this.amount);
                try {
                    Thread.sleep(8000);
                }
                catch(InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
            finally {
                lock.unlock();
            }
        }
        else {
            System.out.println("Fallback method executed");
        }
        
    }
}
