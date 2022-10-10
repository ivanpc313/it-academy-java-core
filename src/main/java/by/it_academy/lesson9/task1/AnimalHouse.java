package by.it_academy.lesson9.task1;

public class AnimalHouse<T extends Animal> {

    private T someAnimal;

    public T getAnimal() {
        return someAnimal;
    }

    public void setAnimal(T someAnimal) {
        this.someAnimal = someAnimal;
    }

}
