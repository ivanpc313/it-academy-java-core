package by.it_academy.lesson8.task1;

public class Main {
    public static void main(String[] args) {

        Dog someDog = new Dog("Rex");
        someDog.eat();
        someDog.makeNoise();

        Cat someCat = new Cat("Kitty");
        someCat.makeNoise();
        someCat.sleeps();

    }
}
