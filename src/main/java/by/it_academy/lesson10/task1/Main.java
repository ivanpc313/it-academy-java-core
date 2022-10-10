package by.it_academy.lesson10.task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(10);
        list.add(2);
        list.add(5);
        list.add(9);
        System.out.println(list);
        System.out.println("The average of list = " + average(list));
        printInRange(list, 1, 3);

    }

    private static double average(List<Integer> numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }
        return sum / numbers.size();
    }

    private static void printInRange(List<Integer> numbers, int lowerLimit, int upperLimit) {
        ArrayList<Integer> numberRange = new ArrayList<>();
        for (int i = lowerLimit; i <= upperLimit; i++) {
            numberRange.add(numbers.get(i));
        }
        System.out.println(numberRange);
    }

}
