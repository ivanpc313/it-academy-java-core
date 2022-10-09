package by.it_academy.lesson9.task1;

public class Cat extends Animal {


    public Cat(String name) {
        super(name);
    }

    public void sleep(){
        System.out.println(name() + " sleep");
    }
}
