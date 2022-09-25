package by.it_academy.lesson5.Task2;

public class PaymentCard {

    private double balance;

    PaymentCard(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "The card has a balance of " + balance;
    }

    public void eatAffordably() {
        if (balance < 2.6) {
            return;
        } else {
            this.balance = balance - 2.6;
        }
    }

    public void eatHeartily() {
        if (balance < 4.6) {
            return;
        } else {
            this.balance = balance - 4.6;
        }
    }

    public void addMoney(double amount) {
        if (amount < 0) {
            this.balance = balance;
        } else {
            this.balance = balance + amount;
        }
    }
}
