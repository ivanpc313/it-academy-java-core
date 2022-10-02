package by.it_academy.lesson6;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        String[] list = new String[]{"Ivan,1991", "Pavel,2001", "Kirill,2015", "Alexander,2003"};

        int maxLength = 0;
        double sum = 0;
        double average = 0;
        double counter = 0;

        for (String item : list) {
            String[] numbers = item.split(",");
            int numbers1 = numbers[0].length();
            double numbers2 = Integer.parseInt(numbers[1]);

            if (maxLength < numbers1) {
                maxLength = numbers[0].length();
                counter++;
            }
            sum += numbers2;
        }

        for (String length : list) {
            String[] numbers = length.split(",");
            if (maxLength == numbers[0].length()) {
                System.out.println(numbers[0]);
            }
        }
        average = sum / counter;
        System.out.println(average);
    }
}


