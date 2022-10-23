package by.it_academy.lesson13.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int simpleNumber;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter simple number: ");
        simpleNumber = in.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= simpleNumber; i++) {
            list.add(i);
        }
        System.out.println(list);

        List<Integer> newList = list.stream()
                .filter(Main::primeNumber)
                .collect(Collectors.toList());

        System.out.println(newList);
    }

    public static boolean primeNumber(int number) {
        return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }
}
