package by.it_academy.lesson13.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some numbers: ");
        while (in.hasNextInt()) {
            list.add(in.nextInt());
        }

        List<Integer> newList = list.stream()
                .filter(number -> number >= 1 && number <= 5)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(newList);
    }
}

