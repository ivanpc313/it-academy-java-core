package by.it_academy.lesson7.task2;

public class Main {

    public static void main(String[] args) {

        Counter someCounter = new Counter();

        someCounter.increase(56);

        someCounter.decrease(54);
        System.out.println(someCounter.value());
    }
}
