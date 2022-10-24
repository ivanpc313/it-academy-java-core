package by.it_academy.lesson12.task1;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = readMyFile();
        System.out.println(numbers);
        List<Integer> cubes = cubes(numbers);
        System.out.println(cubes);
        writeToFile(cubes);
    }

    private static List<Integer> readMyFile() {
        List<Integer> list = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get("src/main/resources/text.txt"))) {
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private static List<Integer> cubes(List<Integer> numbers) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            newList.add(numbers.get(i) * numbers.get(i) * numbers.get(i));
        }
        return newList;
    }

    private static void writeToFile(List<Integer> numbers) {
        try (FileWriter newFile = new FileWriter("New File.txt")) {
            for (int i = 0; i < numbers.size(); i++) {
                final String s = Integer.toString(numbers.get(i));
                newFile.write(s);
                newFile.write(System.lineSeparator());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



