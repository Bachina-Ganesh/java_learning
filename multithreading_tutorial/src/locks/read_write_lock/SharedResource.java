package locks.read_write_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SharedResource {
    ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    Lock readLock = readWriteLock.readLock();
    Lock writeLock = readWriteLock.writeLock();
    int value;

    public SharedResource(int value) {
        this.value = value;
    }

    public void readValue() {
        readLock.lock();
        try {
            System.out.println("Thread "+Thread.currentThread().getName()+" reading a value : "+this.value);
            try {
                Thread.sleep(2000);
            }
            catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            readLock.unlock();
        }
    }

    public void writeValue(int value) {
        writeLock.lock();
        try {
            this.value = value;
            System.out.println("Thread "+Thread.currentThread().getName()+" writing a value : "+this.value);
            try {
                Thread.sleep(4000);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            writeLock.unlock();
        }
    }
}
