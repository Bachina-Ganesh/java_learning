import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        try (ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 2, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2), new CustomThreadFactory(), new ThreadPoolExecutor.DiscardOldestPolicy())) {

            for(int i=0; i<10; i++) {
                int taskId = i+1;
                executor.submit(() -> {
                    System.out.println("Task "+ taskId +" is executed by "+Thread.currentThread().getName());
                    try {
                        Thread.sleep(5000);
                    }
                    catch(InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                });
            }

            executor.shutdown();
        }
    }
}

class CustomThreadFactory implements ThreadFactory {
    static int counter = 0;
    @Override
    public Thread newThread(Runnable r) {
        counter++;
        Thread thread = new Thread(r);
        thread.setName("Custom Thread - "+counter);
        return thread;
    }
    
}
