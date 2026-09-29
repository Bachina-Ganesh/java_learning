package monitorlock;

class SharedResource {
    private StringBuilder sb = new StringBuilder();

    public void add(String str) {
        sb.append(str);
    }

    public int getLength() {
        return sb.length();
    }

    public void display() {
        System.out.println(sb.toString());
    }

}
public class Main {
    static void main() throws InterruptedException{
        SharedResource sr = new SharedResource();

        Thread t1 = new Thread(() -> {
            for(int i=0; i<20; i++) {
                sr.add("A");
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=0; i<20; i++) {
                sr.add("B");
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(sr.getLength());
        sr.display();
    }
}
