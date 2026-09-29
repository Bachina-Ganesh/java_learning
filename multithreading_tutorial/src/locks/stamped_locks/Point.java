package locks.stamped_locks;

import java.util.concurrent.locks.StampedLock;

public class Point {
    int x;
    int y;
    StampedLock stampedLock = new StampedLock();

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        long stamp = stampedLock.writeLock();
        try {
            this.x = x;
        }
        finally {
            stampedLock.unlockWrite(stamp);
        }
        
    }

    public void setY(int y) {
        long stamp = stampedLock.writeLock();
        try {
            this.y = y;
        }
        finally {
            stampedLock.unlockWrite(stamp);
        }
        
    }

    public double power() {
        System.out.println("Thread : "+Thread.currentThread().getName());
        long stmp = stampedLock.tryOptimisticRead();

        int x = getX();
        int y = getY();

        try {
            Thread.sleep(3000);
        }
        catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }

        if(!stampedLock.validate(stmp)) {
            System.out.println("Readed again");
            stmp = stampedLock.readLock();
            try {
                x = getX();
                y = getY();
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
            finally {
                stampedLock.unlockRead(stmp);
            }
        }

        return Math.pow(x, y);
    }
}
