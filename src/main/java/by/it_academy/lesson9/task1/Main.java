package by.it_academy.lesson9.task1;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Kitty");
        cat.sleep();

        Dog dog = new Dog("Rex");
        dog.barks();

        AnimalHouse<Cat> catHouse = new AnimalHouse<>();
        catHouse.setAnimal(cat);
        Cat cat1 = catHouse.getAnimal();

        AnimalHouse<Dog> dogHouse=new AnimalHouse<>();
        dogHouse.setAnimal(dog);
    }
}
