package by.it_academy.lesson3;

public class Task1 {

    public static void main(String[] args) {

        int giftValue = 7000;
        double tax1;
        double tax2;
        double tax3;

        if (giftValue < 5000) {
            tax1 = 0;
            System.out.println("Ваш налог равен - " + tax1 + "р.");
        } else if (giftValue >= 5000 && giftValue < 25000) {
            tax2 = (100 + (giftValue - 5000) * 0.08);
            System.out.println("Ваш налог составляет - " + tax2 + "р.");
        } else if (giftValue >= 25000) {
            tax3 = (1700 + (giftValue - 25000) * 0.1);
            System.out.println("Сумма вашего налога - " + tax3 + "р.");
        }
    }
}
