package by.it_academy.lesson7.task1;

public class Main {
    public static void main(String[] args) {

        Dog someDog = new Dog();
        someDog.eat();
        someDog.makeNoise();

        Cat someCat = new Cat("Kitty");
        someCat.makeNoise();
        someCat.sleeps();

    }
}
