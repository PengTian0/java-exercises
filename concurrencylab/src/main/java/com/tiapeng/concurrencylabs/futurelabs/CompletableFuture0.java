package com.tiapeng.concurrencylabs.futurelabs;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;

public class CompletableFuture0 {

    private static ForkJoinPool forkJoinPool = new ForkJoinPool(10);
    public static void main(String... args) {
        CompletableFuture<Object> completableFuture =
                CompletableFuture.supplyAsync(
                        () -> doExecute(), forkJoinPool);

        completableFuture.whenComplete(
                (v, e) -> {System.out.println(v.toString());}
        );
    }

    public static Object doExecute() {
        System.out.println("thread id: " + Thread.currentThread().getId());
        return Thread.currentThread().getId();
    }
}
