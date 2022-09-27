package by.it_academy.lesson5.Task2;

public class Main {
    public static void main(String[] args) {

        PaymentCard paymentCard = new PaymentCard(2.2);

        System.out.println(paymentCard);

        paymentCard.addMoney(6.6);
        System.out.println(paymentCard);

        paymentCard.eatAffordably();
        System.out.println(paymentCard);

        paymentCard.eatHeartily();
        System.out.println(paymentCard);
    }
}
