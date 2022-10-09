package by.it_academy.lesson10.task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> someValue = new ArrayList<>();
        someValue.add(13);
        someValue.add(10);
        someValue.add(2);
        someValue.add(5);
        someValue.add(9);
        System.out.println(someValue);
        average(someValue);
        printInRange(someValue, 1, 3);

    }

    private static double average(ArrayList<Integer> numbers) {
        double average = 0;
        double sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }
        average = sum / numbers.size();
        System.out.println("The average of list = " + average);
        return average;
    }

    private static void printInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {

        ArrayList<Integer> numberRange = new ArrayList<>();

        for (int i = lowerLimit; i <= upperLimit; i++) {
            numberRange.add(numbers.get(i));
        }
        System.out.println(numberRange);


    }


}
