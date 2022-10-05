package by.it_academy.lesson8.task1;

public abstract class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public void eat() {
        System.out.println(name + " eats");
    }

    public void sleeps() {
        System.out.println(name + " sleeps");
    }
}
