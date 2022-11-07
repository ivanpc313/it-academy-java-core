package by.it_academy.lesson17.task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Dates {

    private final Collection<DateTimeFormatter> formatters;

    public Dates(final Collection<DateTimeFormatter> formatters) {
        this.formatters = formatters;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dates dates = new Dates(
            List.of(
                DateTimeFormatter.ISO_LOCAL_DATE,
                DateTimeFormatter.BASIC_ISO_DATE,
                DateTimeFormatter.ofPattern("dd MM yyyy"),
                DateTimeFormatter.ofPattern("dd/MM/yyyy"),
                DateTimeFormatter.ofPattern("dd*MM*yyyy")
            )
        );
        System.out.println("Enter date:");
        var line = scanner.nextLine();
        LocalDate localDate = dates.localDate(line);
        if (localDate != null) {
            System.out.println(localDate);
        }
    }

    LocalDate localDate(String date) {
        for (final DateTimeFormatter formatter : formatters) {
            try {
                return formatter.parse(date, LocalDate::from);
            } catch (DateTimeParseException e) {
                // ignore
            }
        }
        return null;
    }

}

