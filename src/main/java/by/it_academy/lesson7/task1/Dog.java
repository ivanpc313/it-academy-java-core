package by.it_academy.lesson7.task1;

public class Dog extends Animal implements NoiseCapable {

    public String name1;

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Dog");
    }

    public void bark() {
        System.out.println(name + " barks");
    }

    @Override
    public void makeNoise() {
        bark();
    }
}
