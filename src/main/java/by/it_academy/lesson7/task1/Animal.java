package by.it_academy.lesson7.task1;

public abstract class Animal {

    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {

    }

    public String name(String name) {
        return name;
    }

    public void eat() {
        System.out.println(name + " eats");
    }

    public void sleeps() {
        System.out.println(name + " sleeps");
    }
}
