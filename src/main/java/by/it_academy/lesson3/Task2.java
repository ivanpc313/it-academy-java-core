package by.it_academy.lesson3;

public class Task2 {

    public static void main(String[] args) {

        int var1 = 2345;

        double var2 = (double) (var1 + 8) / 3;

        double result = var2 % -6;

        System.out.println(result);
        System.out.println(result >= -10);
        System.out.println(result < 9);
        System.out.println(result == 0);
        System.out.println(result != -3);
    }
}
