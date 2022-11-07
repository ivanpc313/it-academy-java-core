package by.it_academy.lesson17.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.time.DayOfWeek.FRIDAY;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start year: ");
        String startYear = scanner.nextLine();
        System.out.println("Enter end year:");
        String endYear = scanner.nextLine();

        printList(allFridays13(startYear, endYear));

    }

    private static List<LocalDate> allFridays13(String startYear, String endYearString) {
        LocalDate start = LocalDate.of(Integer.parseInt(startYear), 1, 1);
        int endYear = Integer.parseInt(endYearString);

        return Stream.iterate(start, n -> n.getYear() != endYear, current -> current.plusDays(1))
                .filter(i -> i.getDayOfWeek() == FRIDAY)
                .filter(i -> i.getDayOfMonth() == 13)
                .collect(Collectors.toList());
    }

    private static void printList(List<LocalDate> numbers) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        numbers.forEach(date-> System.out.println(dateTimeFormatter.format(date)));
    }
}
