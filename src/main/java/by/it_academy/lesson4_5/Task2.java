package by.it_academy.lesson4_5;

public class Task2 {

    public static void main(String[] args) {

        int[] array = new int[]{4, 2, 7, 0, 6, 1};

        for (int i : array) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}

