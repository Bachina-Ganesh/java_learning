package executorservice_demo.future_demo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Main {
    private static ExecutorService executorService = new ThreadPoolExecutor(2, 4, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2), new ThreadPoolExecutor.DiscardOldestPolicy());

    public static void main(String[] args) {

        // Future<?> future1 = executorService.submit(() -> {
        //     System.out.println("Task is executed by "+Thread.currentThread().getName());
        //     try {
        //         Thread.sleep(3000);
        //     }
        //     catch(Exception e) {
        //         System.out.println(e.getMessage());
        //     }
        //     System.out.println("Task is completed by "+Thread.currentThread().getName());
        // });

        Future<String> future1 = executorService.submit(() -> {
            System.out.println("Task is executed by "+Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Task is completed by "+Thread.currentThread().getName());
            return "Completed";
        });

        if(future1.isDone()) {
            System.out.println("Task completed");
        }

        if(!future1.isCancelled()) {
            System.out.println("Task is not cancelled");
        }
        
        try {
            future1.get(1, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
        
        try {
            String output = future1.get();
            System.out.println(output);
        }
        catch(InterruptedException | ExecutionException e) {
            System.out.println(e.getMessage());
        }
        

        executorService.shutdown();
    }
}
