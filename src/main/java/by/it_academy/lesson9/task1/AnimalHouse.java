package by.it_academy.lesson9.task1;

public class AnimalHouse <T extends Animal> {

    private String someAnimal;

    public String getSomeAnimal() {
        return someAnimal;
    }

    public void setSomeAnimal(String someAnimal) {
        this.someAnimal = someAnimal;
    }
}
