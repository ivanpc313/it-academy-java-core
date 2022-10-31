package by.it_academy.lesson13.task1;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = randomNumbers();
        System.out.println(numbers);

        Thread positiveEvenThread = new Thread(() -> positiveEvenPrint(numbers));
        positiveEvenThread.start();
        positiveEvenThread.setName("Even numbers: ");

        Thread negativeThread = new Thread(() -> negativePrint(numbers));
        negativeThread.start();
        negativeThread.setName("Negative numbers: ");

        Thread positiveOddThread = new Thread(() -> positiveOddPrint(numbers));
        positiveOddThread.start();
        positiveOddThread.setName("Positive odd numbers: ");
    }

    private static List<Integer> randomNumbers() {
        return ThreadLocalRandom.current()
            .ints(10)
            .boxed()
            .collect(Collectors.toList());

    }

    private static void positiveEvenPrint(List<Integer> numbers) {
        List<Integer> positiveEvenNumber = numbers.stream()
            .filter(number -> number > 0 && number % 2 == 0)
            .collect(Collectors.toList());
        System.out.println(Thread.currentThread().getName() + " " + positiveEvenNumber);
    }

    private static void negativePrint(final List<Integer> numbers) {
        List<Integer> negativeNumber = numbers.stream()
            .filter(number -> number < 0)
            .collect(Collectors.toList());
        System.out.println(Thread.currentThread().getName() + " " + negativeNumber);
    }

    private static void positiveOddPrint(final List<Integer> numbers) {
        List<Integer> positiveOddNumber = numbers.stream()
            .filter(number -> number > 0 && number % 2 != 0)
            .collect(Collectors.toList());
        System.out.println(Thread.currentThread().getName() + " " + positiveOddNumber);
    }

}