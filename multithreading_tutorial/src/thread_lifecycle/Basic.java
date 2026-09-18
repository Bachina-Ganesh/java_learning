package thread_lifecycle;

public class Basic {
    static void main() {

        Thread mainThread = Thread.currentThread();

        Thread t1 = new Thread(() -> {
            System.out.println("Thread is executing it's task : "+Thread.currentThread().getName()+" and state is : "+Thread.currentThread().getState());
            System.out.println("Thread is executing it's task : "+mainThread.getName() +" state is : "+mainThread.getState());
        });

        t1.start();

        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Thread is executing it's task : "+t1.getName() +" state is : "+t1.getState());
        System.out.println("Thread is executing it's task : "+Thread.currentThread().getName() +" state is : "+Thread.currentThread().getState());
    }
}
