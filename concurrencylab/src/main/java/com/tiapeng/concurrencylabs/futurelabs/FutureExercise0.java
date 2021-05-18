package com.tiapeng.concurrencylabs.futurelabs;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExercise0 {

    public static void main(String... args) throws Exception{
        System.out.println("Future Exercise start now");
        ExecutorService es = Executors.newCachedThreadPool();

        long startTime = System.nanoTime();
        System.out.println("start time: " + startTime);
        ArrayList tasks = new ArrayList();
        for (int i = 0; i < 2; i++) {
            tasks.add(new Callable<Integer>() {
                public Integer call() throws Exception {
                    System.out.println("task called");
                    Thread.sleep(5000);
                    return 1;
                }
            });
        }

        List<Future<Integer>> results = es.invokeAll(tasks);

        long endTime = System.nanoTime();
        System.out.println("end time: " + endTime);
        System.out.println("duration1: " + (endTime - startTime));
        for(Future<Integer> result: results) {
            Integer r = result.get();
            System.out.println("return : " + r);
        }
        long finalTime = System.nanoTime();
        System.out.println("final time: " + finalTime);
        System.out.println("duration2: " + (finalTime - startTime));
    }

}
