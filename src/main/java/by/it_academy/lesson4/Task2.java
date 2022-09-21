package by.it_academy.lesson4;

public class Task2 {

    public static void main(String[] args) {

        int[] array = new int[]{4, 2, 7, 3, 6, 1};

        for (int number : array) {
            String stars = new String(new char[number]).replace('\0', '*');
            System.out.println(stars);
        }

    }

}

