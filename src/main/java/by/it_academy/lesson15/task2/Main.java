package by.it_academy.lesson15.task2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(new Robot("Chappy",3,"FFLRRFLF"));
        executorService.submit(new Robot("Karl",2,"FFFRFLLFLF"));
        executorService.submit(new Robot("Pat",4,"LFRFLFRFF"));

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.HOURS);
    }
}
