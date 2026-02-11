package java8;

import java.util.concurrent.*;

//🍕 Food Delivery Example
//You order pizza.
//Before Java 8 (Future style)
//You go to the restaurant
//Stand there waiting
//Do nothing else
//When pizza is ready → you take it
//👉 You were blocked the whole time
//After Java 8 (CompletableFuture style)
//You order pizza
//Go home
//Watch TV
//When pizza arrives → you eat
//👉 You didn’t wait
//👉 You continued doing other work
//👉 When result came → you handled it
//
//That’s CompletableFuture
public class completableFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService ex= Executors.newSingleThreadExecutor();
//        Future<Integer> future = ex.submit(() -> {
//            Thread.sleep(1000);
//            return 10;
//        });
//        // Blocks until result ready
//        Integer result = future.get();
//        System.out.println(result);
//        ex.shutdown();

        //
//        CompletableFuture.supplyAsync(() -> {
//                    try { Thread.sleep(1000); } catch(Exception e){}
//                    return 10;
//                })
//                .thenAccept(System.out::println);

        //ex2
        ExecutorService ex1 = Executors.newSingleThreadExecutor();

        Future<Integer> f = ex1.submit(() -> 10);
        Integer result = f.get();      // Wait
        Integer doubled = result * 2;  // Manual next step
        System.out.println(doubled);
        ex1.shutdown();

        CompletableFuture
                .supplyAsync(() -> 10)
                .thenApply(x -> x * 2)
                .thenAccept(System.out::println);


    }
}
