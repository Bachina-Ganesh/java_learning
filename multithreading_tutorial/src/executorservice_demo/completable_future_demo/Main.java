package executorservice_demo.completable_future_demo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        /* thenApply & thenApplyAsync code */
        /* 
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Task is started by "+Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            }
            catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Task is completed by "+Thread.currentThread().getName());
            return "hello";
        }, executorService).thenApplyAsync((s) -> {
            System.out.println("Task is started by "+Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
            s = s.toUpperCase();
            System.out.println("Task is completed by "+Thread.currentThread().getName());
            return s;
        });

        try {
            String result = future.get();
            System.out.println(result);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        */
        
        /* thenCompose & thenComposeAsnc */
        /* 
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Task is started by "+Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            }
            catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Task is completed by "+Thread.currentThread().getName());
            return "hello";
        }, executorService)
        .thenComposeAsync(s -> {
            System.out.println("Task is started by "+Thread.currentThread().getName());
            System.out.println("Task is completed by "+Thread.currentThread().getName());
            return CompletableFuture.supplyAsync(() -> s.toUpperCase());
        },executorService);

        try {
            String result = future.get();
            System.out.println(result);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        */

        /* theCombine & thenCombineAsync */

        CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(() -> 10);
        CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(() -> 20);

        f1.thenCombine(f2, (r1, r2) -> r1 + r2).thenAccept(result -> System.out.println(result));

    

        executorService.shutdown();
    }
}
