package by.it_academy.lesson15.task1;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(new DecimalFormat("0.###E0").format(factorialFast()));
    }

    public static BigInteger factorialFast() throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newWorkStealingPool();
        Future<BigInteger> factorialFuture = executorService.submit(() -> factorial(100000));
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.MINUTES);
        return factorialFuture.get();
    }

    private static BigInteger factorial(int n) {
        return IntStream.rangeClosed(2, n)
            .parallel()
            .mapToObj(BigInteger::valueOf)
            .reduce(BigInteger::multiply)
            .orElse(BigInteger.ONE);
    }

}

