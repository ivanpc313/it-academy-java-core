package by.it_academy.lesson13.task1;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Thread positiveEvenThread = new Thread(Main::positiveEvenPrint);
        positiveEvenThread.start();
        positiveEvenThread.setName("Even numbers: ");

        Thread negativeThread = new Thread(Main::negativePrint);
        negativeThread.start();
        negativeThread.setName("Negative numbers: ");

        Thread positiveOddThread = new Thread(Main::positiveOddPrint);
        positiveOddThread.start();
        positiveOddThread.setName("Positive odd numbers: ");
    }

    private static List<Integer> randomNumbers() {
        return ThreadLocalRandom.current()
                .ints(10)
                .boxed()
                .collect(Collectors.toList());

    }

    private static void positiveEvenPrint() {
        Collection<Integer> numbers = randomNumbers();
        List<Integer> positiveEvenNumber = numbers.stream()
                .filter(number -> number > 0 && number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(Thread.currentThread().getName() + " " + positiveEvenNumber);
    }

    private static void negativePrint() {
        Collection<Integer> numbers = randomNumbers();
        List<Integer> negativeNumber = numbers.stream()
                .filter(number -> number < 0)
                .collect(Collectors.toList());
        System.out.println(Thread.currentThread().getName() + " " + negativeNumber);
    }

    private static void positiveOddPrint() {
        Collection<Integer> numbers = randomNumbers();
        List<Integer> positiveOddNumber = numbers.stream()
                .filter(number -> number > 0 && number % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(Thread.currentThread().getName() + " " + positiveOddNumber);
    }
}