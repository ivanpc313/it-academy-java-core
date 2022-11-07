package by.it_academy.lesson17.task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date:");
        var date = scanner.nextLine();
        returnLocalDate(date);


        // 2011-12-03, 20111203, 03 12 2011, 03/12/2011.
    }

    private static void returnLocalDate(String date) {
        try {
            LocalDate parse = LocalDate.parse(date, DateTimeFormatter.BASIC_ISO_DATE);
            System.out.println(parse.toString());
        } catch (DateTimeParseException e) {
            try {
                LocalDate parse = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
                System.out.println(parse.toString());
            } catch (DateTimeParseException ex) {
                try {
                    LocalDate parse = LocalDate.parse(date, DateTimeFormatter.ofPattern("MM dd yyyy"));
                    System.out.println(parse.toString());
                } catch (DateTimeParseException exp) {
                    try {
                        LocalDate parse = LocalDate.parse(date, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
                        System.out.println(parse.toString());
                    } catch (DateTimeParseException exception) {
                        System.out.println("No exepteble pattern");
                    }
                }
            }
        }
    }
}

