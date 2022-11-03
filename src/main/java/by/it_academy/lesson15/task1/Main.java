package by.it_academy.lesson15.task1;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newWorkStealingPool();

        for (int i = 0; i <= 100000; i++) {
            //    BigInteger myFactorial = executorService.submit()


        }

        System.out.println(new DecimalFormat(",###").format(streamedParallel(100000)));

    }

    public static Object streamedParallel(int n) {
        ForkJoinPool forkJoinPool = new ForkJoinPool(4);

        if (n < 2) return BigInteger.valueOf(1);
        return IntStream.rangeClosed(2, n).parallel()
                .mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();

    }
}

