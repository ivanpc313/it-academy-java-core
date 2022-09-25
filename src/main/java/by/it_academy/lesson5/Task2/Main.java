package by.it_academy.lesson5.Task2;

public class Main {
    public static void main(String[] args) {

        PaymentCard var1 = new PaymentCard(2.2);

        System.out.println(var1);

        var1.addMoney(6.6);
        System.out.println(var1);

        var1.eatAffordably();
        System.out.println(var1);

        var1.eatHeartily();
        System.out.println(var1);
    }
}
