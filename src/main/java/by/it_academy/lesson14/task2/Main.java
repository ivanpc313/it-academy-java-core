package by.it_academy.lesson14.task2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter simple number: ");
        int simpleNumber = in.nextInt();

        IntStream.rangeClosed(2, simpleNumber)
            .filter(Main::primeNumber)
            .forEach(System.out::println);
    }

    public static boolean primeNumber(int number) {
        return IntStream.rangeClosed(2, number / 2)
            .noneMatch(i -> number % i == 0);
    }

}
