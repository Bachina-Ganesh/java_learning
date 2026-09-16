package executorservice_demo;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    static void main() {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

//        executorService.execute(() -> {
//            System.out.println("Task 1 is running in thread: " + Thread.currentThread().getName());
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                System.out.println(e.getMessage());
//            }
//            finally {
//                System.out.println("Task 1 is completed in thread: " + Thread.currentThread().getName());
//            }
//        });
//
//        System.out.println(executorService.isShutdown());
//        executorService.shutdown();


//        Future<?> result = executorService.submit(() -> {
//            System.out.println("Task 1 is running in thread: " + Thread.currentThread().getName());
//            throw new IOException("Exception in Task 1");
//        });
//
//        try {
//            result.get();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        } finally {
//            executorService.shutdown();
//        }

        CompletableFuture<Void> exceptionally = CompletableFuture.supplyAsync(() -> {
                    System.out.println("Task 1 is running in thread: " + Thread.currentThread().getName());
                    if(false) {
                        throw new RuntimeException("Exception in Task 1");
                    }
                    return "Task 1 completed";
                }).thenAccept(System.out::println)
                .exceptionally(ex -> {
                    System.out.println("Exception occurred: " + ex.getMessage());
                    return null;
                });

    }
}
