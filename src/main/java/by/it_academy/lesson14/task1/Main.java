package by.it_academy.lesson14.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some numbers: ");
        while (in.hasNextInt()) {
            int nextInt = in.nextInt();
            if (nextInt == -1) {
                break;
            }
            list.add(nextInt);
        }

        List<Integer> newList = list.stream()
            .filter(number -> number >= 1 && number <= 5)
            .distinct()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());

        System.out.println(newList);
    }

}

