package by.it_academy.lesson4;

public class Task1 {

    public static void main(String[] args) {

        int[] array = new int[]{4, 7, 2, 0, 2, 1};

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма чисел в массиве = " + sum);

    }
}
