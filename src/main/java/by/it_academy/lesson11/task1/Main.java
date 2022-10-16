package by.it_academy.lesson11.task1;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = List.of("1", "65", "hg", "15");
        for (String item : list) {
            try {
                System.out.println(Integer.parseInt(item));
            } catch (NumberFormatException e) {
                System.out.println(item + " is not a number");
            }
        }
    }
}
