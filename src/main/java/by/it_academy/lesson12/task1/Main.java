package by.it_academy.lesson12.task1;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        List<Integer> someMetod = readMyFile();
        System.out.println(someMetod);
        printNewList(changeMyFile(someMetod));
        fileWriter(changeMyFile(someMetod));
    }

    private static List<Integer> readMyFile() {
        List<Integer> list = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get("src/main/java/by/it_academy/lesson12/task1/text.txt"))) {
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private static List<Integer> changeMyFile(List<Integer> someList) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < someList.size(); i++) {
            newList.add(someList.get(i) * someList.get(i) * someList.get(i));
        }
        return newList;
    }

    private static List<Integer> printNewList(List<Integer> someList) {
        System.out.println(someList);
        return null;
    }

    private static void fileWriter(List<Integer> someList) {
        try (FileWriter newFile = new FileWriter("src/main/java/by/it_academy/lesson12/task1/New File.txt")) {
            for (int i = 0; i < someList.size(); i++) {
                final String s = Integer.toString(someList.get(i));
                newFile.write(s);
                newFile.write(System.lineSeparator());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



