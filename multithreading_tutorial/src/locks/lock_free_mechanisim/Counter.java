package locks.lock_free_mechanisim;

public class Counter {
    int count;

    public Counter(int count) {
        this.count = count;
    }

    public synchronized void increment() {
        this.count++;
    }

    public int getCount() {
        return this.count;
    }
}
