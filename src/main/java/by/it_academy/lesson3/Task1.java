package by.it_academy.lesson3;

public class Task1 {

    public static void main(String[] args) {

        int giftValue = 5065;

        double percent1 = (100 + (giftValue - 5000) * 0.08);
        double percent2 = (1700 + (giftValue - 25000) * 0.1);

        if (giftValue < 5000) {
            System.out.println("Ваш налог равен 0");
        } else if (giftValue >= 5000 && giftValue < 25000) {
            System.out.println("Ваш налог равен " + percent1);
        } else if (giftValue >= 25000) {
            System.out.println("Ваш налог равен " + percent2);
        }

    }
}
