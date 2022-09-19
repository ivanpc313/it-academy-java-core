package by.it_academy.lesson3;

public class Task1 {

    public static void main(String[] args) {

        int giftValue = 25000;
        double tax;

        if (giftValue < 5000) {
            tax = 0;

        } else if (giftValue >= 5000 && giftValue < 25000) {
            tax = (100 + (giftValue - 5000) * 0.08);

        } else {
            tax = (1700 + (giftValue - 25000) * 0.1);

        }
        System.out.println("Ваш налог равен - " + tax + "р.");
    }
}
