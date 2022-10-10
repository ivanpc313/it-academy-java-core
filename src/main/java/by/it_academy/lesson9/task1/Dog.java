package by.it_academy.lesson9.task1;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void barks() {
        System.out.println(name() + " barks");
    }

}
