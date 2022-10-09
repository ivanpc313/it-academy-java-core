package by.it_academy.lesson9.task1;

public class Main {

    public static void main(String[] args) {

        Cat someAnimal = new Cat("Kitty");
        someAnimal.sleep();

        Dog someAnimal2 = new Dog("Rex");
        someAnimal2.barks();

        AnimalHouse <Cat> animal = new AnimalHouse<>();
        animal.setSomeAnimal("Grey");

    }
}
